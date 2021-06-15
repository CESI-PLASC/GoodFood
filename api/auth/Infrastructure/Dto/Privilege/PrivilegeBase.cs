using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Dto.Privilege
{
    public abstract class PrivilegeBase
    {
        [JsonProperty("id")]
        public int Id {get; set;}

        [JsonProperty("designation")]
        public string Designation {get; set;}
    }
}