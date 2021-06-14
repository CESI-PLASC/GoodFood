using System.Collections.Generic;
using System.Threading.Tasks;
using GoodFood.Auth.Infrastructure.Models;
using GoodFood.Auth.Infrastructure.Models.Paiements;
using GoodFood.Auth.Infrastructure.Models.Paiements.Carte;
using GoodFood.Auth.Infrastructure.Services.Utilisateur;
using Stripe;

namespace GoodFood.Auth.Infrastructure.Services.Paiement
{
    public class MethodePaiementService : IMethodePaiementService
    {
        private IUtilisateurService _utilisateurService;
        private PaymentMethodService _paymentMethodService;

        public MethodePaiementService(IUtilisateurService utilisateurService)
        {
            this._utilisateurService = utilisateurService;
            this._paymentMethodService = new PaymentMethodService();
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

        public async Task<MethodePaiementModele> creerMethodePaiementUtilisateur(MethodePaiementCreerModele methodePaiementCreer)
        {
            // Récupération de l'utilisateur
            UtilisateurModele utilisateur = await this._utilisateurService.one(methodePaiementCreer.utilisateurId);

            // Création du moyen de paiement
            PaymentMethod methodePaiementStripe = this._paymentMethodService.Create(new PaymentMethodCreateOptions
            {
                Type = "card",
                Card = new PaymentMethodCardOptions
                {
                    Number = methodePaiementCreer.carte.numero,
                    ExpMonth = methodePaiementCreer.carte.expireMois,
                    ExpYear = methodePaiementCreer.carte.expireAnnee,
                    Cvc = methodePaiementCreer.carte.cvc
                }
            });

            // Ajout du propriétaire du moyen de paiement
            this._paymentMethodService.Attach(methodePaiementStripe.Id, new PaymentMethodAttachOptions
            {
                Customer = utilisateur.stripe
            });

            return new MethodePaiementModele
            {
                id = methodePaiementStripe.Id,
                type = methodePaiementStripe.Type,
                carte = new MethodePaiementCarteModele
                {
                    marque = methodePaiementStripe.Card.Brand,
                    expireAnnee = methodePaiementStripe.Card.ExpYear,
                    expireMois = methodePaiementStripe.Card.ExpMonth,
                    pays = methodePaiementStripe.Card.Country,
                    derniersChiffres = methodePaiementStripe.Card.Last4
                }
            };
        }
    }
}