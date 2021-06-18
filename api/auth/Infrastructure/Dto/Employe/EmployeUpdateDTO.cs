using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Dto.Employe
{
    public abstract class EmployeUpdateDTO : EmployeDTO
    {
        [JsonProperty("id")]
        public int Id {get; set;}

        [JsonProperty("password")]
        public int Password {get; set;}
    }
}