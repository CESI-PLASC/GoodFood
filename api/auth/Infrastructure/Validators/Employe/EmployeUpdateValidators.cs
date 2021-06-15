using FluentValidation;

using GoodFood.Auth.Infrastructure.Dto.Employe;

namespace GoodFood.Auth.Infrastructure.Validators.Employe
{
    public class EmployeUpdateValidator : AbstractValidator<EmployeUpdateDTO>
    {
        public EmployeUpdateValidator() {
            RuleFor(e => e.Id).NotEmpty();
            RuleFor(e => e.Nom).NotEmpty();
            RuleFor(e => e.Prenom).NotEmpty();
            RuleFor(e => e.Email).NotEmpty();
            RuleFor(e => e.Franchise).NotEmpty();
        }
    }
}