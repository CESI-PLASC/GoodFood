using System.Collections.Generic;
using System.Threading.Tasks;
using GoodFood.Auth.Data;

using GoodFood.Auth.Infrastructure.Entities;

namespace GoodFood.Auth.Infrastructure.Repositories.Employe
{
    public class EmployeRepository : IEmployeRepository {

        private readonly ApplicationDbContext _context;

        public EmployeRepository(ApplicationDbContext context) {
            _context = context;
        }

        public async Task<IEnumerable<EmployeEntity>> GetAllAsync() {
            return _context.Employe;
        }
        public async Task<EmployeEntity> GetAsync(int id) {
            return await _context.Employe.AsNoTracking()
                .Where(e => e.id == id)
                .FirstOrDefaultAsync(); 
        }
        public async Task<EmployeEntity> AddAsync(EmployeEntity employe) {
            _context.Employe.Add(employe);
            await _context.SaveChangesAsync();
            return employe;
        }
        public async Task<EmployeEntity> UpdateAsync(EmployeEntity employe) {
            _context.Employe.Update(employe);
            await _context.SaveChangesAsync();
            return employe;
        }
        public async void DeleteAsync(EmployeEntity employe) {
            _context.Remove(employe);
            await _context.SaveChangesAsync();
        }
        public bool Exist(int id) {
            return _context.Employe.Any(e => e.id == id);
        }
    }
}