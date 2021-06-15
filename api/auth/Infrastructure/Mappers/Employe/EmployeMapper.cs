using AutoMapper;
using GoodFood.Auth.Infrastructure.Entities;
using GoodFood.Auth.Infrastructure.Dto.Employe;

namespace GoodFood.Auth.Infrastructure.Mappers.Employe
{
    public class EmployeProfile : Profile
    {
        public EmployeProfile() {
            CreateMap<EmployeEntity, EmployeDTO>();

            CreateMap<EmployeCreateDTO, EmployeEntity>()
                .ForMember(target => target.Nom, opt => opt.MapFrom(source => source.Nom))
                .ForMember(target => target.Prenom, opt => opt.MapFrom(source => source.Prenom))
                .ForMember(target => target.Email, opt => opt.MapFrom(source => source.Email))
                .ForMember(target => target.TelephoneMobile, opt => opt.MapFrom(source => source.TelephoneMobile))
                .ForMember(target => target.Franchise, opt => opt.MapFrom(source => source.Franchise))
                .ForMember(target => target.Privileges, opt => opt.MapFrom(source => source.Privileges));

            CreateMap<EmployeUpdateDTO, EmployeEntity>()
                .ForMember(target => target.Id, opt => opt.MapFrom(source => source.Id))
                .ForMember(target => target.Nom, opt => opt.MapFrom(source => source.Nom))
                .ForMember(target => target.Prenom, opt => opt.MapFrom(source => source.Prenom))
                .ForMember(target => target.Email, opt => opt.MapFrom(source => source.Email))
                .ForMember(target => target.TelephoneMobile, opt => opt.MapFrom(source => source.TelephoneMobile))
                .ForMember(target => target.Franchise, opt => opt.MapFrom(source => source.Franchise))
                .ForMember(target => target.Privileges, opt => opt.MapFrom(source => source.Privileges));
        }
    }
}