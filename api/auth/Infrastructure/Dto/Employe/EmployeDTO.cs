using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Dto.Employe
{
    public class EmployeDTO : EmployeBase
    {
        [JsonProperty("id")]
        public int Id {get; set;}
    }
}