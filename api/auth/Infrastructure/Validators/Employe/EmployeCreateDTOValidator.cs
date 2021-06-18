using FluentValidation;

using GoodFood.Auth.Infrastructure.Dto.Employe;

namespace GoodFood.Auth.Infrastructure.Validators.Employe
{
    public class EmployeCreateDTOValidator : AbstractValidator<EmployeCreateDTO>
    {
        public EmployeCreateDTOValidator() {
            RuleFor(e => e.Nom).NotEmpty();
            RuleFor(e => e.Prenom).NotEmpty();
        }
    }
}