using FluentValidation;

using GoodFood.Auth.Infrastructure.Dto.Employe;

namespace GoodFood.Auth.Infrastructure.Validators.Employe
{
    public class EmployeUpdateDTOValidator : AbstractValidator<EmployeUpdateDTO>
    {
        public EmployeUpdateDTOValidator() {
            RuleFor(e => e.Id).NotEmpty();
            RuleFor(e => e.Nom).NotEmpty();
            RuleFor(e => e.Prenom).NotEmpty();
        }
    }
}