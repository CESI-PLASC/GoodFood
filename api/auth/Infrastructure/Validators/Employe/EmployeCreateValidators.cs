using FluentValidation;

using GoodFood.Auth.Infrastructure.Dto.Employe;

namespace GoodFood.Auth.Infrastructure.Validators.Employe
{
    public class EmployeCreateValidator : AbstractValidator<EmployeCreateDTO>
    {
        public EmployeCreateValidator() {
            RuleFor(e => e.Nom).NotEmpty();
            RuleFor(e => e.Prenom).NotEmpty();
            RuleFor(e => e.Email).NotEmpty();
            RuleFor(e => e.Franchise).NotEmpty();
        }
    }
}