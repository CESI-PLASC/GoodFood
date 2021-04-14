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

        [HttpGet, Route(UrlUtil.PAIEMENT_RESSOURCE.METHODES), Produces("application/json")]
        [ProducesResponseType(typeof(IEnumerable<PaiementMethodeModel>), (int)HttpStatusCode.OK)]
        public async Task<IActionResult> getMethodes([FromRoute] int idUtilisateur)
        {
            List<PaiementMethodeModel> methodes = await this._paiementService.methodes(idUtilisateur);
            return Ok(methodes);
        }

        [HttpPost, Route(UrlUtil.PAIEMENT_RESSOURCE.UTILISATEURS), Produces("application/json")]
        [ProducesResponseType(typeof(PaiementCodeModele), (int)HttpStatusCode.OK)]
        public IActionResult generateCodePaiement([FromBody] UtilisateurModel utilisateur)
        {
            PaiementCodeModele codePaiement = this._paiementService.generateCodePaiement(utilisateur);
            return Ok(codePaiement);
        }
    }
}