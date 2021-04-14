using System.Collections.Generic;
using System.Threading.Tasks;
using auth.Models;
using auth.Models.paiements;

namespace auth.infrastructure.Services.paiement
{
    public interface IPaiementService
    {
        Task<PaiementModel> commande(int idCommande);
        Task<List<PaiementMethodeModel>> methodes(int idUtilisateur);
        PaiementCodeModele generateCodePaiement(UtilisateurModel utilisateur);
    }
}