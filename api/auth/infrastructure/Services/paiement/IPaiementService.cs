using System.Collections.Generic;
using System.Threading.Tasks;
using auth.Models.paiements;

namespace auth.infrastructure.Services.paiement
{
    public interface IPaiementService
    {
        Task<PaiementModel> commande(int idCommande);
        List<PaiementMethodeModel> methodes(int idUtilisateur);
    }
}