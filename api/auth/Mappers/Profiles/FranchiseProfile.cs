using auth.Dto;
using auth.entities;
using AutoMapper;

namespace auth.Mappers.Profiles
{
    public class FranchiseProfile : Profile
    {
        public FranchiseProfile(){

            CreateMap<Franchise, FranchiseDto>();

            CreateMap<FranchiseCreateDto, Franchise>()
                .ForMember(dest => dest.Mail, opt => opt.MapFrom(src => src.Mail))
                .ForMember(dest => dest.Tel, opt => opt.MapFrom(src => src.Tel))
                .ForMember(dest => dest.Designation, opt => opt.MapFrom(src => src.Designation))
                .ForAllOtherMembers(opt => opt.Ignore())
            ;

            CreateMap<FranchiseUpdateDto, Franchise>()
                .ForMember(dest => dest.Mail, opt => opt.MapFrom(src => src.Mail))
                .ForMember(dest => dest.Tel, opt => opt.MapFrom(src => src.Tel))
                .ForMember(dest => dest.Designation, opt => opt.MapFrom(src => src.Designation))
                .ForMember(dest => dest.Id, opt => opt.MapFrom(src => src.Id))
                .ForAllOtherMembers(opt => opt.Ignore())
            ;
        }
    }
}