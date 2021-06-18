using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Dto.Employe
{
    public abstract class EmployeCreateDTO : EmployeDTO
    {

        [JsonProperty("password")]
        public int Password {get; set;}
    }
}