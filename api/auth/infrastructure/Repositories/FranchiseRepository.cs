using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using auth.data;
using Microsoft.EntityFrameworkCore;
using auth.entities;

namespace auth.infrastructure.Repositories
{
    public class FranchiseRepository : IFranchiseRepository
    {
        private readonly ApplicationDbContext _context;

        public FranchiseRepository(ApplicationDbContext context)
        {
            this._context = context;
        }

        public async Task<Franchise> GetAsync(int id)
        {
            return await this._context.Franchise.AsNoTracking()
                .Where(Franchise => Franchise.Id == id)
                .Where(Franchise => Franchise.EstSupprime == false)
                // .Include(f => f.Adresse)
                .FirstOrDefaultAsync();
        }

        public async Task<IEnumerable<Franchise>> GetAllAsync()
        {
            return await this._context.Franchise
                // .Include(f => f.Adresse)
                .Where(Franchise => Franchise.EstSupprime == false)
                .ToListAsync();
        }

        public async Task<Franchise> AddAsync(Franchise franchise)
        {
            this._context.Franchise.Add(franchise);
            await this._context.SaveChangesAsync();
            return franchise;
        }

        public async Task<Franchise> UpdateAsync(Franchise franchise)
        {
            this._context.Franchise.Update(franchise);
            await this._context.SaveChangesAsync();
            return franchise;
        }

        public async Task<Franchise> DeleteAsync(Franchise franchise)
        {
            franchise.EstSupprime = true;
            this._context.Franchise.Update(franchise);
            await this._context.SaveChangesAsync();
            return franchise;
        }

        public bool Exist(int id)
        {
            return this._context.Franchise.Any(f => f.Id == id);
        }
    }
}