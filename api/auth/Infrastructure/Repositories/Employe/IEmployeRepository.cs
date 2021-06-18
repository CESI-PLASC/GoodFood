using System.Collections.Generic;
using System.Threading.Tasks;

using GoodFood.Auth.Entities;

namespace GoodFood.Auth.Infrastructure.Repositories.Employe
{
    public interface IEmployeRepository
    {
        Task<IEnumerable<EmployeEntity>> GetAllAsync();
        Task<EmployeEntity> GetByIdAsync(int id);
        Task<EmployeEntity> GetByEmailAsync(string email);
        Task<EmployeEntity> AddAsync(EmployeEntity employe);
        Task<EmployeEntity> UpdateAsync(EmployeEntity employe);
        void DeleteAsync(EmployeEntity employe);
        bool Exist(int Id);
        bool ExistingEmail(string email);
    }
}