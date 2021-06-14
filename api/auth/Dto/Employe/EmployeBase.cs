using Newtonsoft.Json;

namespace GoodFood.Auth.Dto.Employe
{
    public abstract class EmployeBase
    {
        [JsonProperty("nom")]
        public string Nom {get; set;}

        [JsonProperty("prenom")]
        public string Prenom {get; set;}

        [JsonProperty("email")]
        public string Email {get; set;}

        [JsonProperty("telephoneFixe")]
        public string TelephoneFixe {get; set;}

        [JsonProperty("telephoneMobile")]
        public string TelephoneMobile {get; set;}

        [JsonProperty("franchise")]
        public string Franchise {get; set;}
    }
}