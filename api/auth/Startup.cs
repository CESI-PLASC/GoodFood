using System;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using Microsoft.OpenApi.Models;
using Microsoft.Extensions.Logging;
using Microsoft.EntityFrameworkCore;
using FluentValidation.AspNetCore;
using Newtonsoft.Json.Converters;
using Stripe;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.IdentityModel.Tokens;
using System.Text;

using GoodFood.Auth.Data;
using GoodFood.Auth.Infrastructure.Helpers;
using GoodFood.Auth.Infrastructure.Repositories.Employe;
using GoodFood.Auth.Infrastructure.Services.Employe;
using GoodFood.Auth.Infrastructure.Services.Commande;
using GoodFood.Auth.Infrastructure.Services.Paiement;
using GoodFood.Auth.Infrastructure.Services.Utilisateur;
using GoodFood.Auth.Security.Services;

namespace GoodFood
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
                .AddNewtonsoftJson(opt => opt.SerializerSettings.ReferenceLoopHandling =
                    Newtonsoft.Json.ReferenceLoopHandling.Ignore)
                .AddNewtonsoftJson(opt => {
                    opt.SerializerSettings.Converters.Add(new StringEnumConverter());
                })
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

                // c.AddFluentValidationRules();
            });

            var appSettingsSection = Configuration.GetSection("AppSettings");
            services.Configure<AppSettings>(appSettingsSection);

            services.AddDbContextPool<ApplicationDbContext>(
                options => options.UseMySql(Configuration.GetConnectionString("DefaultConnection"),
                new MySqlServerVersion(new Version(8, 0, 22)))
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
            services.AddTransient<IEmployeRepository, EmployeRepository>();

            // Services
            services.AddTransient<IAuthService, AuthService>();
            services.AddTransient<IPasswordHasher, PasswordHasher>();
            services.AddTransient<ICommandeService, CommandeService>();
            services.AddTransient<IUtilisateurService, UtilisateurService>();
            services.AddTransient<IPaiementService, PaiementService>();
            services.AddTransient<IMethodePaiementService, MethodePaiementService>();
            services.AddTransient<IEmployeService, EmployeService>();

            
            
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env, AutoMapper.IConfigurationProvider autoMapper, ILoggerFactory loggerFactory)
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
