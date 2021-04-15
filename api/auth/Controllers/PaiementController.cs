using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using auth.infrastructure.Services.paiement;
using auth.Models;
using auth.Models.paiements;
using auth.Utils;
using Microsoft.AspNetCore.Mvc;
using Stripe;
using System;

namespace auth.Controllers
{
    public class PaiementController : ControllerBase
    {
        private IPaiementService _paiementService;

        public PaiementController(IPaiementService paiementService)
        {
            this._paiementService = paiementService;
        }

        [HttpPost, Route(UrlUtil.PAIEMENT_RESSOURCE.PAIEMENT_COMMANDES), Produces("application/json")]
        [ProducesResponseType(typeof(void), (int)HttpStatusCode.OK)]
        public async Task<IActionResult> payerCommande([FromBody] PaiementCommande paiementCommande)
        {
            await this._paiementService.commande(paiementCommande.idCommande, paiementCommande.idPaiementMethode);
            return Ok();
        }
    }
}