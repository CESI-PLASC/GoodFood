using System.Collections.Generic;
using System.Threading.Tasks;

using GoodFood.Auth.Entities;

namespace GoodFood.Auth.Infrastructure.Services.Employe
{
    public interface IEmployeService
    {
        Task<IEnumerable<EmployeEntity>> GetAll();
        Task<EmployeEntity> GetOne(int id);
        Task<EmployeEntity> Add(EmployeEntity employe);
        Task<EmployeEntity> Update(EmployeEntity employe);
        void Delete(EmployeEntity employe);
    }
}