using System.Threading.Tasks;
using GoodFood.Auth.Security.Models;

namespace GoodFood.Auth.Security.Services
{
    public interface IAuthService
    {
        Task<AuthResponse> Signup(SignupRequest model);
        Task<AuthResponse> Signin(SigninRequest model);
    }
}