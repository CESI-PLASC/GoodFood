using Newtonsoft.Json;

namespace auth.Dto
{
    public class FranchiseDto : FranchiseBase
    {
        [JsonProperty("id")]
        public int Id { get; set; }
    }
}