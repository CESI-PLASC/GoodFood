using System.Threading.Tasks;
using auth.Models;

namespace auth.infrastructure.Services.commande
{
    public interface ICommandeService
    {
        Task<CommandeModel> one(int idCommande);
        Task<double> prix(int idCommande);
    }
}