using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using auth.infrastructure.Services.commande;
using auth.Models;
using auth.Models.paiements;
using Stripe;

namespace auth.infrastructure.Services.paiement
{
    public class PaiementService : IPaiementService
    {
        private ICommandeService _commandeService;

        public PaiementService(ICommandeService commandeService)
        {
            this._commandeService = commandeService;
        }

        public async Task<PaiementModel> commande(int idCommande/*, string idPaiementMethode*/)
        {

            // Récupération du prix de la commande
            CommandeModel commande = await this._commandeService.one(idCommande);
            double prix = await this._commandeService.prix(idCommande);
            var match = Regex.Match(prix.ToString(), @"^([0-9]+)(?:,([0-9]+))?$");
            Console.WriteLine(commande.utilisateur.id.ToString());

            // Création de l'intent
            PaymentIntent intent = new PaymentIntentService().Create(new PaymentIntentCreateOptions
            {
                Amount = Int64.Parse(match.Groups[1].Value + match.Groups[2].Value),
                Currency = "eur",
                PaymentMethodTypes = new List<string>{
                    "card"
                },
                // PaymentMethod = idPaiementMethode,
                Customer = commande.utilisateur.id.ToString()
            });

            return new PaiementModel()
            {
                client_secret = intent.ClientSecret
            };
        }

        public List<PaiementMethodeModel> methodes(int idUtilisateur)
        {
            List<PaiementMethodeModel> methodesPaiement = new List<PaiementMethodeModel>();

            // Récupération des moyen de paiements si l'utilisateur existe
            try
            {
                StripeList<PaymentMethod> methodesPaiementStripe = new PaymentMethodService().List(new PaymentMethodListOptions
                {
                    Customer = idUtilisateur.ToString(),
                    Type = "card"
                });


                foreach (PaymentMethod methodePaiement in methodesPaiementStripe)
                {
                    methodesPaiement.Add(new PaiementMethodeModel
                    {
                        id = methodePaiement.Id
                    });
                }
            }
            catch (StripeException) { }

            return methodesPaiement;
        }
    }
}