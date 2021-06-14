using System.Threading.Tasks;
using GoodFood.Auth.Models;

namespace GoodFood.Auth.Infrastructure.Services.Commande
{
    public interface ICommandeService
    {
        Task<CommandeModele> one(int idCommande);
        Task<double> prix(int idCommande);
    }
}