using System.Threading.Tasks;
using auth.Models;

namespace auth.infrastructure.Services.commande
{
    public interface ICommandeService
    {
        Task<CommandeModele> one(int idCommande);
        Task<double> prix(int idCommande);
    }
}