using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Dto.Employe
{
    public abstract class EmployeBase
    {
        [JsonProperty("nom")]
        public string Nom {get; set;}

        [JsonProperty("prenom")]
        public string Prenom {get; set;}
    }
}