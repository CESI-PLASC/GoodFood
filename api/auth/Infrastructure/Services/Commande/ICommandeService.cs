using System.Threading.Tasks;
using GoodFood.Auth.Infrastructure.Models;

namespace GoodFood.Auth.Infrastructure.Services.Commande
{
    public interface ICommandeService
    {
        Task<CommandeModele> one(int idCommande);
        Task<double> prix(int idCommande);
    }
}