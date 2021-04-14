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

        public PaiementService(ICommandeService commandeService, IUtilisateurService utilisateurService)
        {
            this._commandeService = commandeService;
            this._utilisateurService = utilisateurService;
        }

        public PaiementCodeModele generateCodePaiement(UtilisateurModel utilisateur)
        {
            Console.WriteLine(utilisateur.email);

            Customer customer = new CustomerService().Create(new CustomerCreateOptions
            {
                Email = utilisateur.email,
                Name = utilisateur.nom,
                Phone = utilisateur.telephoneFixe,
                Description = $"{utilisateur.nom} {utilisateur.prenom}"
            });

            Console.WriteLine(customer.Id);

            return new PaiementCodeModele
            {
                codePaiement = customer.Id
            };
        }

        public async Task<PaiementModel> commande(int idCommande/*, string idPaiementMethode*/)
        {
            // Récupération du prix de la commande
            CommandeModel commande = await this._commandeService.one(idCommande);
            double prix = await this._commandeService.prix(idCommande);
            var match = Regex.Match(prix.ToString(), @"^([0-9]+)(?:,([0-9]+))?$");

            // Création de l'intent
            PaymentIntent intent = new PaymentIntentService().Create(new PaymentIntentCreateOptions
            {
                Amount = Int64.Parse(match.Groups[1].Value + match.Groups[2].Value),
                Currency = "eur",
                PaymentMethodTypes = new List<string>{
                    "card"
                },
                // PaymentMethod = idPaiementMethode,
                Customer = commande.utilisateur.codePaiement
            });

            return new PaiementModel()
            {
                client_secret = intent.ClientSecret
            };
        }

        public async Task<List<PaiementMethodeModel>> methodes(int idUtilisateur)
        {
            // Récupération de l'utilisateur
            UtilisateurModel utilisateur = await this._utilisateurService.one(idUtilisateur);

            // Récupération des moyen de paiements si l'utilisateur existe
            List<PaiementMethodeModel> methodesPaiement = new List<PaiementMethodeModel>();
            {
                try
                {
                    StripeList<PaymentMethod> methodesPaiementStripe = new PaymentMethodService().List(new PaymentMethodListOptions
                    {
                        Customer = utilisateur.codePaiement,
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
}