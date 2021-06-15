using AutoMapper;

using GoodFood.Auth.Infrastructure.Mappers.Profiles;

namespace GoodFood.Auth.Infrastructure.Mappers
{
    public static class AutoMapperConfiguration
    {
        public static MapperConfiguration RegisterMappings()
        {
            return new MapperConfiguration(cfg =>
            {
                cfg.AddProfile(new EmployeProfile());
            });
        }
    }
}