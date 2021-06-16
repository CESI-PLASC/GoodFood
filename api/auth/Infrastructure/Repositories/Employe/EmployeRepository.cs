using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using System.Linq;

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

        public async Task<IEnumerable<EmployeEntity>> GetAllAsync()
        {
            return await _context.EmployeEntities.ToListAsync();
        }

        public async Task<EmployeEntity> GetByIdAsync(int id)
        {
            return await _context.EmployeEntities.AsNoTracking().Where(e => e.Id == id).FirstOrDefaultAsync();
        }

        public async Task<EmployeEntity> GetByEmailAsync(string email)
        {
            return await _context.EmployeEntities.AsNoTracking().Where(e => e.Email == email).FirstOrDefaultAsync();
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

        public async void DeleteAsync(EmployeEntity employe)
        {
            _context.EmployeEntities.Remove(employe);
            await _context.SaveChangesAsync();
        }

        public bool Exist(int id)
        {
            return _context.EmployeEntities.Any(e => e.Id == id);
        }

        public bool ExistingEmail(string email)
        {
            return _context.EmployeEntities.Any(e => e.Email == email);
        }
    }
}