using Newtonsoft.Json;

namespace GoodFood.Auth.Dto.Employe
{
    public class EmployeDTO : EmployeBase
    {
        [JsonProperty("id")]
        public int Id {get; set;}
    }
}