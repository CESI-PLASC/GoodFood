using System.Collections.Generic;
using System.Threading.Tasks;
using GoodFood.Auth.Infrastructure.Models;
using GoodFood.Auth.Infrastructure.Models.Paiements;

namespace GoodFood.Auth.Infrastructure.Services.Paiement
{
    public interface IPaiementService
    {
        Task commande(int idCommande, string idPaiementMethode);
    }
}