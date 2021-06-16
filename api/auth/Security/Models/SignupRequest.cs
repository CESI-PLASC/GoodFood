namespace GoodFood.Auth.Security.Models
{
    public class SignupRequest
    {
        public string nom {get; set;}
        public string prenom {get; set;}
        public string email {get; set;}
        public string password {get; set;}
        public int franchiseId {get; set;}
    }
}