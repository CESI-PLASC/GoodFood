using System.Collections.Generic;
using System.Threading.Tasks;
using auth.entities;

namespace auth.infrastructure.Repositories
{
    public interface IFranchiseRepository
    {
        Task<IEnumerable<Franchise>> GetAllAsync();
        Task<Franchise> GetAsync(int id);
        Task<Franchise> AddAsync(Franchise franchise);
        Task<Franchise> UpdateAsync(Franchise franchise);
        Task<Franchise> DeleteAsync(Franchise franchise);
        bool Exist(int id);
    }
}