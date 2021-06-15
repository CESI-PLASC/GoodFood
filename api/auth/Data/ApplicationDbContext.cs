using Microsoft.EntityFrameworkCore;

using GoodFood.Auth.Entities;

namespace GoodFood.Auth.Data
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options) : base(options)
        {}

        public DbSet<EmployeEntity> EmployeEntities {get; set;}

        protected override void OnModelCreating(ModelBuilder builder)
        {
            base.OnModelCreating(builder);
        }
    }
}