using System.Collections.Generic;
using System.Threading.Tasks;
using GoodFood.Auth.Models.Paiements;

namespace GoodFood.Auth.Infrastructure.Services.Paiement
{
    public interface IMethodePaiementService
    {
        Task<List<MethodePaiementModele>> allByUser(long idUtilisateur);
        Task<MethodePaiementModele> creerMethodePaiementUtilisateur(MethodePaiementCreerModele methodePaiementCreer);
    }
}