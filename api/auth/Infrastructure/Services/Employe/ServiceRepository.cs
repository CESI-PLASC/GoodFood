using System.Collections.Generic;
using System.Threading.Tasks;

using GoodFood.Auth.Data;
using GoodFood.Auth.Entities;
using GoodFood.Auth.Infrastructure.Repositories.Employe;

namespace GoodFood.Auth.Infrastructure.Services.Employe
{
    public class EmployeService : IEmployeService
    {
        private readonly IEmployeRepository _repository;

        public EmployeService(IEmployeRepository repository) {
            _repository = repository;
        }

        public Task<IEnumerable<EmployeEntity>> GetAll()
        {
            return _repository.GetAllAsync();
        }

        public async Task<EmployeEntity> GetOne(int id)
        {
            return await _repository.GetAsync(id);
        }

        public async Task<EmployeEntity> Add(EmployeEntity employe)
        {
            return await _repository.AddAsync(employe);
        }

        public async Task<EmployeEntity> Update(EmployeEntity employe)
        {
            return await _repository.UpdateAsync(employe);
        }

        public void Delete(EmployeEntity employe)
        {
            _repository.DeleteAsync(employe);
        }
    }
}