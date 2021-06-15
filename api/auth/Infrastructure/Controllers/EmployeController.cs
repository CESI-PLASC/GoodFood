using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using AutoMapper;
using System.Net;
using System.Threading.Tasks;

using GoodFood.Auth.Infrastructure.Services.Employe;

namespace GoodFood.Auth.Infrastructure.Controllers
{
    [ApiController]
    public class EmployeController : ControllerBase
    {
        private readonly EmployeService _service;

        public EmployeController(EmployeService service) {
            _service = service;
        }
    }
}