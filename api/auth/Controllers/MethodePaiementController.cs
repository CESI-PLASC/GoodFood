using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using auth.infrastructure.Services.paiement;
using auth.Models.paiements;
using auth.Utils;
using Microsoft.AspNetCore.Mvc;

namespace auth.Controllers
{
    public class MethodePaiementController : ControllerBase
    {
        private IMethodePaiementService _methodePaiementService;

        public MethodePaiementController(IMethodePaiementService methodePaiementService)
        {
            this._methodePaiementService = methodePaiementService;
        }

        [HttpGet, Route(UrlUtil.METHODE_PAIEMENT_RESSOURCE.METHODES_PAIEMENT_UTILISATEUR), Produces("application/json")]
        [ProducesResponseType(typeof(IEnumerable<MethodePaiementModele>), (int)HttpStatusCode.OK)]
        public async Task<IActionResult> getMethodesUtilisateur([FromRoute] long idUtilisateur)
        {
            List<MethodePaiementModele> methodes = await this._methodePaiementService.allByUser(idUtilisateur);
            return Ok(methodes);
        }

        [HttpPost, Route(UrlUtil.METHODE_PAIEMENT_RESSOURCE.METHODES_PAIEMENT_UTILISATEURS), Produces("application/json")]
        [ProducesResponseType(typeof(IEnumerable<MethodePaiementModele>), (int)HttpStatusCode.OK)]
        public async Task<IActionResult> creerMethodeUtilisateur([FromBody] MethodePaiementCreerModele methodePaiementCreer)
        {
            MethodePaiementModele methodePaiement = await this._methodePaiementService.creerMethodePaiementUtilisateur(methodePaiementCreer);
            return Ok(methodePaiement);
        }
    }
}