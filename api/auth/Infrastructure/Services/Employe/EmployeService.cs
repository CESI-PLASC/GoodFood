using System.Threading.Tasks;
using System.Collections.Generic;

using GoodFood.Auth.Infrastructure.Entities;
using GoodFood.Auth.Infrastructure.Repositories.Employe;

namespace GoodFood.Auth.Infrastructure.Services.Employe
{
    public class EmployeService: IEmployeService
    {
        private EmployeRepository _repository;

        public EmployeService(EmployeRepository repository) {
            _repository = repository;
        }

        public async Task<IEnumerable<EmployeEntity>> getAll()
        {
            return await _repository.GetAllAsync();
        }
        public async Task<EmployeEntity> get(int id)
        {
            return await _repository.GetAsync(id);
        }
        public async Task<EmployeEntity> add(EmployeEntity employe)
        {
            return await _repository.AddAsync(employe);
        }
        public async Task<EmployeEntity> update(EmployeEntity employe)
        {
            return await _repository.UpdateAsync(employe);
        }
        public void delete(EmployeEntity employe)
        {
            _repository.DeleteAsync(employe);
        }
    }
}