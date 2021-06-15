using System.Collections.Generic;
using System.Threading.Tasks;

using GoodFood.Auth.Infrastructure.Entities;

namespace GoodFood.Auth.Infrastructure.Services.Employe
{
    public interface IEmployeService
    {
        Task<IEnumerable<EmployeEntity>> getAll();
        Task<EmployeEntity> get(int id);
        Task<EmployeEntity> add(EmployeEntity employe);
        Task<EmployeEntity> update(EmployeEntity employe);
        void delete(EmployeEntity employe);
    }
}