using System.Collections.Generic;
using System.Threading.Tasks;

using GoodFood.Auth.Entities;

namespace GoodFood.Auth.Repositories.EmployeRepository
{
    public interface IEmployeRepository {
        Task<IEnumerable<Employe>> GetAllAsync();
        Task<Employe> GetAsync(int id);
        Task<Employe> AddAsync(Employe employe);
        Task<Employe> UpdateAsync(Employe employe);
        void DeleteAsync(Employe employe);
        bool Exist(int id);
    }
}