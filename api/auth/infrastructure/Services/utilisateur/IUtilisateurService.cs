using System.Threading.Tasks;
using auth.Models;

namespace auth.infrastructure.Services.utilisateur
{
    public interface IUtilisateurService
    {
        Task<UtilisateurModele> one(long idUtilisateur);
    }
}