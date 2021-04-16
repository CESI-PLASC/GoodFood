using System.Collections.Generic;
using System.Threading.Tasks;
using auth.Models.paiements;

namespace auth.infrastructure.Services.paiement
{
    public interface IMethodePaiementService
    {
        Task<List<MethodePaiementModele>> allByUser(long idUtilisateur);
        Task<MethodePaiementModele> creerMethodePaiementUtilisateur(MethodePaiementCreerModele methodePaiementCreer);
    }
}