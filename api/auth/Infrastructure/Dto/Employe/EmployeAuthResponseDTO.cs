using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Dto.Employe
{
    public abstract class EmployeAuthResponseDTO : EmployeBase
    {
        [JsonProperty("id")]
        public int Id {get; set;}
    }
}