using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using auth.infrastructure.Services.commande;
using auth.infrastructure.Services.utilisateur;
using auth.Models;
using auth.Models.paiements;
using Stripe;

namespace auth.infrastructure.Services.paiement
{
    public class PaiementService : IPaiementService
    {
        private ICommandeService _commandeService;
        private IUtilisateurService _utilisateurService;
        private PaymentIntentService _paymentIntentService;

        public PaiementService(ICommandeService commandeService, IUtilisateurService utilisateurService)
        {
            this._commandeService = commandeService;
            this._utilisateurService = utilisateurService;
            this._paymentIntentService = new PaymentIntentService();
        }

        public async Task commande(int idCommande, string idPaiementMethode)
        {
            // Récupération du prix de la commande
            CommandeModele commande = await this._commandeService.one(idCommande);
            double prix = await this._commandeService.prix(idCommande);
            var match = Regex.Match(prix.ToString(), @"^([0-9]+)(?:(?:,|.)([0-9]+))?$");

            // Création de l'intent
            PaymentIntent intent = this._paymentIntentService.Create(new PaymentIntentCreateOptions
            {
                Amount = Int64.Parse(match.Groups[1].Value + match.Groups[2].Value),
                Currency = "eur",
                PaymentMethod = idPaiementMethode,
                Customer = commande.utilisateur.stripe
            });

            // Validation du paiement
            this._paymentIntentService.Confirm(intent.Id);
        }
    }
}