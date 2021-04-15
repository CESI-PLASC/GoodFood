using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using auth.infrastructure.Services.utilisateur;
using auth.Models;
using auth.Models.paiements;
using Stripe;

namespace auth.infrastructure.Services.paiement
{
    public class MethodePaiementService : IMethodePaiementService
    {
        private IUtilisateurService _utilisateurService;

        public MethodePaiementService(IUtilisateurService utilisateurService)
        {
            this._utilisateurService = utilisateurService;
        }

        public async Task<List<MethodePaiementModele>> allByUser(long idUtilisateur)
        {
            // Récupération de l'utilisateur
            UtilisateurModele utilisateur = await this._utilisateurService.one(idUtilisateur);
            

            // Récupération des moyen de paiements si l'utilisateur existe
            List<MethodePaiementModele> methodesPaiement = new List<MethodePaiementModele>();
            try
            {
                StripeList<PaymentMethod> methodesPaiementStripe = new PaymentMethodService().List(new PaymentMethodListOptions
                {
                    Customer = utilisateur.stripe,
                    Type = "card"
                });

                foreach (PaymentMethod methodePaiement in methodesPaiementStripe)
                {
                    methodesPaiement.Add(new MethodePaiementModele
                    {
                        id = methodePaiement.Id,
                        type = methodePaiement.Type,
                        carte = new MethodePaiementCarteModele
                        {
                            marque = methodePaiement.Card.Brand,
                            expireAnnee = methodePaiement.Card.ExpYear,
                            expireMois = methodePaiement.Card.ExpMonth,
                            pays = methodePaiement.Card.Country,
                            derniersChiffres = methodePaiement.Card.Last4
                        }
                    });
                }
            }
            catch (StripeException) { }

            return methodesPaiement;
        }
    }
}