using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Threading.Tasks;
using auth.data;
using auth.infrastructure.helpers;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.HttpsPolicy;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Microsoft.EntityFrameworkCore;
using Pomelo.EntityFrameworkCore.MySql.Infrastructure;
using auth.infrastructure.Repositories;
using auth.infrastructure.Services;
using FluentValidation.AspNetCore;

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
            .AddFluentValidation(fvc => fvc.RegisterValidatorsFromAssemblyContaining<Startup>());

            services.AddSwaggerGen(c => {
                c.OrderActionsBy(api => api.RelativePath);
                c.SwaggerDoc("v1", new OpenApiInfo{
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

            services.AddCors(options => {
                options.AddPolicy(MyAllowSpecificOrigins,builder => {
                    builder.WithOrigins("*");
                });
            });


            services.AddAutoMapper(typeof(Startup).Assembly);

            // Repositories
            services.AddTransient<IFranchiseRepository, FranchiseRepository>();

            // Services
            services.AddTransient<IFranchiseService, FranchiseService>();
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

            app.UseSwaggerUI(c => {
                c.SwaggerEndpoint("/swagger/v1/swagger.json", "Goodfood api - Utilisateurs");
                c.RoutePrefix = String.Empty;
            });

            app.UseRouting();

            app.UseCors(MyAllowSpecificOrigins);

            app.UseAuthorization();

            app.UseEndpoints(endpoints =>
            {
                endpoints.MapControllers();
            });
        }
    }
}
