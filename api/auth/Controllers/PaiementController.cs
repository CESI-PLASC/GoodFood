using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using auth.infrastructure.Services.paiement;
using auth.Models.paiements;
using auth.Utils;
using Microsoft.AspNetCore.Mvc;
using Stripe;

namespace auth.Controllers
{
    public class PaiementController : ControllerBase
    {
        private IPaiementService _paiementService;

        public PaiementController(IPaiementService paiementService)
        {
            this._paiementService = paiementService;
        }

        [HttpGet, Route(UrlUtil.PAIEMENT_RESSOURCE.INTENT), Produces("application/json")]
        [ProducesResponseType(typeof(PaymentIntent), (int)HttpStatusCode.OK)]
        public async Task<IActionResult> GetIntent([FromRoute] int idCommande)
        {
            PaiementModel paiement = await this._paiementService.commande(idCommande);
            return Ok(paiement);
        }

        [HttpGet, Route(UrlUtil.PAIEMENT_RESSOURCE.METHODES), Produces("application/json")]
        [ProducesResponseType(typeof(IEnumerable<PaiementMethodeModel>), (int)HttpStatusCode.OK)]
        public IActionResult getMethodes([FromRoute] int idUtilisateur)
        {
            List<PaiementMethodeModel> methodes = this._paiementService.methodes(idUtilisateur);
            return Ok(methodes);
        }
    }
}