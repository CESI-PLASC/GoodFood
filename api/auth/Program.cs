using System;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Hosting;

using GoodFood.Auth.Infrastructure.Services.Employe;

namespace GoodFood
{
    public class Program
    {
        private readonly EmployeService _service;

        public Program(EmployeService service) {
            _service = service;
        }

        public static void Main(string[] args)
        {
            CreateHostBuilder(args).Build().Run();

            Console.WriteLine("Ping");
        }

        public static IHostBuilder CreateHostBuilder(string[] args) =>
            Host.CreateDefaultBuilder(args)
                .ConfigureWebHostDefaults(webBuilder =>
                {
                    webBuilder.UseStartup<Startup>();
                });
    }
}
