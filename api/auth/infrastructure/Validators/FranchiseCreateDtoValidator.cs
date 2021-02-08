using auth.Dto;
using FluentValidation;

namespace auth.infrastructure.Validators
{
    public class FranchiseCreateDtoValidator : AbstractValidator<FranchiseCreateDto>
    {
        public FranchiseCreateDtoValidator(){
            RuleFor(x => x.Designation).NotEmpty();
        }
    }
}