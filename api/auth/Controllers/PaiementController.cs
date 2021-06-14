using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using GoodFood.Auth.Infrastructure.Services.Paiement;
using GoodFood.Auth.Models;
using GoodFood.Auth.Models.Paiements;
using GoodFood.Auth.Utils;
using Microsoft.AspNetCore.Mvc;
using Stripe;
using System;

namespace GoodFood.Auth.Controllers
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