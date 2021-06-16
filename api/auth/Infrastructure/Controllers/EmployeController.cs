using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using GoodFood.Auth.Infrastructure.Services.Employe;
using GoodFood.Auth.Entities;
using GoodFood.Auth.Infrastructure.Dto.Employe;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using AutoMapper;

namespace GoodFood.Auth.Infrastructure.Controllers
{
    public class EmployeController : ControllerBase
    {
        private const string API_VERSION = "/v1";
        private const string BASE_URL = "api" + API_VERSION;
        private const string RESSOURCE_URL = BASE_URL + "/employes";

        private const string GET_BY_ID = RESSOURCE_URL + "/{id}";


        private IEmployeService _service;
        private IMapper _mapper;

        public EmployeController(IEmployeService service, IMapper mapper)
        {
            _service = service;
            _mapper = mapper;
        }

        [HttpGet, Route(GET_BY_ID), Produces("application/json")]
        [ProducesResponseType(typeof(EmployeDTO), StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status404NotFound)]
        public async Task<IActionResult> GetById([FromRoute] int id)
        {
            var employe = await _service.GetOneById(id);
            if (employe is null) {
                return NotFound();
            }
            return Ok(employe);
        }


        [HttpGet, Route(RESSOURCE_URL), Produces("application/json")]
        [ProducesResponseType(typeof(IEnumerable<EmployeDTO>), StatusCodes.Status200OK)]
        public async Task<IActionResult> GetAll()
        {
            var employe = await _service.GetAll();
            return Ok(employe);
        }
    }
}