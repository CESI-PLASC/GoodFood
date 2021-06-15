using System.Diagnostics;
using AutoMapper;

using GoodFood.Auth.Entities;
using GoodFood.Auth.Infrastructure.Dto.Employe;

namespace GoodFood.Auth.Infrastructure.Mappers.Profiles
{
    public class EmployeProfile : Profile
    {
        public EmployeProfile() {
            CreateMap<EmployeEntity, EmployeDTO>();

            CreateMap<EmployeCreateDTO, EmployeEntity>()
                .ForMember(target => target.Nom, opt => opt.MapFrom(source => source.Nom))
                .ForMember(target => target.Prenom, opt => opt.MapFrom(source => source.Prenom))
                .ForAllOtherMembers(opt => opt.Ignore());

            CreateMap<EmployeUpdateDTO, EmployeEntity>()
                .ForMember(target => target.Id, opt => opt.MapFrom(source => source.Id))
                .ForMember(target => target.Nom, opt => opt.MapFrom(source => source.Nom))
                .ForMember(target => target.Prenom, opt => opt.MapFrom(source => source.Prenom))
                .ForAllOtherMembers(opt => opt.Ignore());
        }
    }
}