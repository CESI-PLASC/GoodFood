using System;
using System.Collections.Generic;
using System.Net;
using System.Net.Http;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using auth.Dto.commande;
using auth.Models.paiements;
using auth.Utils;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using Stripe;

namespace auth.Controllers
{
    public class PaiementController : ControllerBase
    {

        public PaiementController()
        {

        }

        [HttpGet, Route(UrlUtil.PAIEMENT_RESSOURCE.INTENT), Produces("application/json")]
        [ProducesResponseType(typeof(PaymentIntent), (int)HttpStatusCode.OK)]
        public async Task<IActionResult> GetIntent([FromRoute] int idCommande)
        {
            // Récupération du prix de la commande
            Double prix = 0;
            using (HttpClient httpClient = new HttpClient())
            {
                using (HttpResponseMessage response = await httpClient.GetAsync("http://localhost:8080/api/commandes/" + idCommande + "/prix"))
                {
                    string jsonstr = await response.Content.ReadAsStringAsync();
                    prix = JsonConvert.DeserializeObject<CommandePriceDTO>(jsonstr).prix;
                }
            }
            var match = Regex.Match(prix.ToString(), @"^([0-9]+)(?:,([0-9]+))?$");

            // Création de l'intent
            PaymentIntent intent = new PaymentIntentService().Create(new PaymentIntentCreateOptions
            {
                Amount = Int64.Parse(match.Groups[1].Value + match.Groups[2].Value),
                Currency = "eur",
                PaymentMethodTypes = new List<string>{
                    "card"
                }
            });

            return Ok(new PaiementModel()
            {
                client_secret = intent.ClientSecret
            });
        }
    }
}