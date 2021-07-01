using GoodFood.Auth.Entities;

namespace GoodFood.Auth.Security.Models
{
    public class AuthResponse
    {
        public EmployeEntity User {get; set;}
        public string Token { get; set; }


        public AuthResponse(EmployeEntity user, string token)
        {
            User = user;
            Token = token;
        }
    }
}