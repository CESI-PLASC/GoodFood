using System.Collections.Generic;
using System.Threading.Tasks;
using GoodFood.Auth.Models;
using GoodFood.Auth.Models.Paiements;

namespace GoodFood.Auth.Infrastructure.Services.Paiement
{
    public interface IPaiementService
    {
        Task commande(int idCommande, string idPaiementMethode);
    }
}