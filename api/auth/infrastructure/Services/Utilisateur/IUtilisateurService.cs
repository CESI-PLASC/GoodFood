using System.Threading.Tasks;
using GoodFood.Auth.Models;

namespace GoodFood.Auth.Infrastructure.Services.Utilisateur
{
    public interface IUtilisateurService
    {
        Task<UtilisateurModele> one(long idUtilisateur);
    }
}