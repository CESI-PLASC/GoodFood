using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Dto.Franchise
{
    public abstract class FranchiseBase
    {
        [JsonProperty("designation")]
        public string Designation {get; set;}

        [JsonProperty("email")]
        public string Email {get; set;}

        [JsonProperty("telephoneFixe")]
        public string TelephoneFixe {get; set;}

        [JsonProperty("telephoneMobile")]
        public string TelephoneMobile {get; set;}

        [JsonProperty("estSupprime")]
        public string EstSupprime {get; set;}
    }
}