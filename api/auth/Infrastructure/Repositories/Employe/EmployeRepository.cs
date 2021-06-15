using System;
using System.Collections.Generic;
using System.Threading.Tasks;

using GoodFood.Auth.Data;
using GoodFood.Auth.Entities;

namespace GoodFood.Auth.Infrastructure.Repositories.Employe
{
    public class EmployeRepository : IEmployeRepository
    {
        private readonly ApplicationDbContext _context;

        public EmployeRepository(ApplicationDbContext context) {
            _context = context;
        }

        public Task<IEnumerable<EmployeEntity>> GetAllAsync()
        {
            return null;
        }

        public async Task<EmployeEntity> GetAsync(int id)
        {
            object[] args = new object[1];
            args[0] = id;

            Console.WriteLine("\n\n\n");
            Console.WriteLine(await _context.EmployeEntities.FindAsync(args));
            Console.WriteLine("\n\n\n");

            return new EmployeEntity();
        }

        public async Task<EmployeEntity> AddAsync(EmployeEntity employe)
        {
            _context.EmployeEntities.Add(employe);
            await _context.SaveChangesAsync();
            return employe;
        }

        public async Task<EmployeEntity> UpdateAsync(EmployeEntity employe)
        {
            _context.EmployeEntities.Update(employe);
            await _context.SaveChangesAsync();
            return employe;
        }

        public void DeleteAsync(EmployeEntity employe)
        {
            _context.EmployeEntities.Remove(employe);
            _context.SaveChangesAsync();
        }

        public bool Exist(int id)
        {
            return false; // TODO _context.EmployeEntity.Any() not found
        }
    }
}