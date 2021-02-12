using Newtonsoft.Json;

namespace auth.Dto
{
    public class FranchiseBase
    {
        [JsonProperty("designation")]
        public string Designation {get; set;}

        [JsonProperty("tel")]
        public string Tel {get; set;}

        [JsonProperty("mail")]
        public string Mail {get; set;}
    }
}