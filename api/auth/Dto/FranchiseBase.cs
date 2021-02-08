using Newtonsoft.Json;

namespace auth.Dto
{
    public class FranchiseBase
    {
        [JsonProperty("designation")]
        public string Designation {get; set;}
    }
}