using System;
using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using auth.Dto;
using auth.entities;
using auth.infrastructure.Exceptions;
using auth.infrastructure.Services;
using auth.Utils;
using AutoMapper;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace auth.Controllers
{
    public class FranchiseController : ControllerBase
    {
        private readonly IFranchiseService _franchiseService;
        private readonly IMapper _mapper;

        public FranchiseController(IFranchiseService FranchiseService, IMapper mapper)
        {
            this._franchiseService = FranchiseService ?? throw new ArgumentNullException(nameof(FranchiseService));
            this._mapper = mapper ?? throw new ArgumentNullException(nameof(mapper));
        }

        [HttpGet, Route(UrlUtil.FRANCHISE_RESSOURCE.FRANCHISES), Produces("application/json")]
        [ProducesResponseType(typeof(IEnumerable<FranchiseDto>), (int)HttpStatusCode.OK)]
        public async Task<IActionResult> GetAll()
        {
            var franchises = await this._franchiseService.GetAll();
            return Ok(this._mapper.Map<IEnumerable<FranchiseDto>>(franchises));
        }

        [HttpGet, Route(UrlUtil.FRANCHISE_RESSOURCE.FRANCHISE), Produces("application/json")]
        [ProducesResponseType(typeof(FranchiseDto), StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status404NotFound)]
        public async Task<IActionResult> Get([FromRoute] int idFranchise)
        {
            var franchise = await this._franchiseService.Get(idFranchise);

            if (franchise is null)
            {
                return NotFound();
            }

            return Ok(this._mapper.Map<FranchiseDto>(franchise));
        }

        [HttpPost, Route(UrlUtil.FRANCHISE_RESSOURCE.FRANCHISES), Produces("application/json")]
        [ProducesResponseType(typeof(FranchiseDto), StatusCodes.Status201Created)]
        [ProducesResponseType(StatusCodes.Status400BadRequest)]
        public async Task<IActionResult> Add([FromBody] FranchiseCreateDto franchiseCreateDto)
        {
            var franchise = await this._franchiseService.Add(this._mapper.Map<Franchise>(franchiseCreateDto));

            return CreatedAtAction(
                nameof(FranchiseController.Get),
                "Franchise", new { idFranchise = franchise.Id}, this._mapper.Map<FranchiseDto>(franchise)
            );
        }

        [HttpPut, Route(UrlUtil.FRANCHISE_RESSOURCE.FRANCHISES), Produces("application/json")]
        [ProducesResponseType(typeof(FranchiseDto), StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status404NotFound)]
        public async Task<IActionResult> Update([FromBody] FranchiseUpdateDto franchiseUpdateDto)
        {
            try{
                var franchise = await this._franchiseService.Update(this._mapper.Map<Franchise>(franchiseUpdateDto));
                return Ok(this._mapper.Map<FranchiseDto>(franchise));
            } catch {
                return NotFound();
            }
        }

        [HttpDelete, Route(UrlUtil.FRANCHISE_RESSOURCE.FRANCHISE), Produces("application/json")]
        [ProducesResponseType(StatusCodes.Status204NoContent)]
        [ProducesResponseType(StatusCodes.Status404NotFound)]
        public async Task<IActionResult> Delete([FromRoute] int idFranchise)
        {
            Console.Out.WriteLine(idFranchise);
            try{
                await this._franchiseService.Delete(idFranchise);
                return NoContent();
            } catch {
                return NotFound();
            }
        }
    }
}