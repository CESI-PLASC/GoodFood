using Newtonsoft.Json;

namespace auth.Dto
{
    public class FranchiseUpdateDto : FranchiseBase
    {
        [JsonProperty("id")]
        public int Id { get; set; }
    }
}