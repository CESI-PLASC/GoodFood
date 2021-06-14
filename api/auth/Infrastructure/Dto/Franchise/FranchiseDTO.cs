using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Dto.Franchise
{
    public class FranchiseDTO : FranchiseBase
    {
        [JsonProperty("id")]
        public int Id {get; set;}
    }
}