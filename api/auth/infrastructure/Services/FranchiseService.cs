using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using auth.entities;
using auth.infrastructure.Exceptions;
using auth.infrastructure.Repositories;
using auth.Utils;

namespace auth.infrastructure.Services
{
    public class FranchiseService : IFranchiseService
    {
        private readonly IFranchiseRepository _FranchiseRepository;

        public FranchiseService(IFranchiseRepository FranchiseRepository)
        {
            this._FranchiseRepository = FranchiseRepository ??
                               throw new ArgumentNullException(nameof(FranchiseRepository));
        }

        public async Task<Franchise> Get(int id)
        {
            var franchise = await this._FranchiseRepository.GetAsync(id);
            if (franchise == null)
            {
                throw new NotFoundException(ExceptionMessageUtil.NOT_FOUND);
            }
            return franchise;  
        }

        public async Task<IEnumerable<Franchise>> GetAll()
        {
            return await this._FranchiseRepository.GetAllAsync();
        }

        public async Task<Franchise> Add(Franchise franchise){
            return await this._FranchiseRepository.AddAsync(franchise);
        }

        public async Task<Franchise> Update(Franchise franchise){
            if(!this._FranchiseRepository.Exist(franchise.Id)){
                throw new NotFoundException(ExceptionMessageUtil.NOT_FOUND);
            }
            return await this._FranchiseRepository.UpdateAsync(franchise);
        }

        public async Task Delete(int id){
            var franchiseInBase = await this._FranchiseRepository.GetAsync(id);

            if (franchiseInBase is null)
            {
                throw new NotFoundException(ExceptionMessageUtil.NOT_FOUND);
            }

            await this._FranchiseRepository.DeleteAsync(franchiseInBase);
        }
    }
}