using System;
using auth.data;
using auth.infrastructure.helpers;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using Microsoft.OpenApi.Models;
using Microsoft.EntityFrameworkCore;
using FluentValidation.AspNetCore;
using Stripe;
using auth.infrastructure.Services.commande;
using auth.infrastructure.Services.paiement;
using auth.infrastructure.Services.utilisateur;

namespace auth
{
    public class Startup
    {
        readonly String MyAllowSpecificOrigins = "_myAllowSpecificOrigins";
        public Startup(IConfiguration configuration)
        {
            Configuration = configuration;

        }

        public IConfiguration Configuration { get; }

        // This method gets called by the runtime. Use this method to add services to the container.
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddControllers()
                .AddFluentValidation(fvc => fvc.RegisterValidatorsFromAssemblyContaining<Startup>())
            ;

            services.AddSwaggerGen(c =>
            {
                c.OrderActionsBy(api => api.RelativePath);
                c.SwaggerDoc("v1", new OpenApiInfo
                {
                    Title = "Goodfood / Commande api",
                    Version = "v1"
                });

                // var xmlFile = $"{Assembly.GetExecutingAssembly().GetName().Name}.xml";
                // var xmlPath = Path.Combine(AppContext.BaseDirectory, xmlFile);
                // c.IncludeXmlComments(xmlPath);
            });

            var appSettingsSection = Configuration.GetSection("AppSettings");
            services.Configure<AppSettings>(appSettingsSection);

            services.AddDbContextPool<ApplicationDbContext>(
                options => options.UseMySql(Configuration.GetConnectionString("DefaultConnection"), new MySqlServerVersion(new Version(8, 0, 22)))
            );

            services.AddCors(options =>
            {
                options.AddPolicy(MyAllowSpecificOrigins, builder =>
                {
                    builder.WithOrigins("*");
                });
            });


            services.AddAutoMapper(typeof(Startup).Assembly);

            // Repositories

            // Services
            services.AddTransient<ICommandeService, CommandeService>();
            services.AddTransient<IUtilisateurService, UtilisateurService>();
            services.AddTransient<IPaiementService, PaiementService>();
            services.AddTransient<IMethodePaiementService, MethodePaiementService>();
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env, AutoMapper.IConfigurationProvider autoMapper)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            autoMapper.AssertConfigurationIsValid();

            // app.UseHttpsRedirection();

            app.UseSwagger();

            app.UseSwaggerUI(c =>
            {
                c.SwaggerEndpoint("/swagger/v1/swagger.json", "Goodfood api - Utilisateurs");
                c.RoutePrefix = String.Empty;
            });

            app.UseRouting();

            app.UseCors(builder =>
            {
                builder.AllowAnyOrigin();
            });

            app.UseAuthorization();

            app.UseEndpoints(endpoints =>
            {
                endpoints.MapControllers();
            });

            StripeConfiguration.ApiKey = Configuration.GetValue<String>("Stripe:API_KEY");
        }
    }
}
