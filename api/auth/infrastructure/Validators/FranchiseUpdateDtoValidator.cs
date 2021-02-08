using auth.Dto;
using FluentValidation;

namespace auth.infrastructure.Validators
{
    public class FranchiseUpdateDtoValidator : AbstractValidator<FranchiseUpdateDto>
    {
        public FranchiseUpdateDtoValidator(){
            RuleFor(x => x.Id).NotEmpty();
            RuleFor(x => x.Designation).NotEmpty();
        }
    }
}