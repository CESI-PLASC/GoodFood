using System.Collections.Generic;
using System.Threading.Tasks;
using auth.entities;

namespace auth.infrastructure.Services
{
    public interface IFranchiseService
    {
        Task<IEnumerable<Franchise>> GetAll();
        Task<Franchise> Get(int id);
        Task<Franchise> Add(Franchise hotel);
        Task<Franchise> Update(Franchise hotel);
        Task Delete(int id);
    }
}