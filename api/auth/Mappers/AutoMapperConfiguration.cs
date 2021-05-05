using AutoMapper;

namespace auth.Mappers
{
    public static class AutoMapperConfiguration
    {
        public static MapperConfiguration RegisterMappings()
        {
            return new MapperConfiguration(cfg =>
            {
                // cfg.AddProfile(new FranchiseProfile());
            });
        }
    }
}