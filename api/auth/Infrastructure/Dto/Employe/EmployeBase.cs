using System.Collections.Generic;
using Newtonsoft.Json;
using GoodFood.Auth.Infrastructure.Dto.Franchise;
using GoodFood.Auth.Infrastructure.Dto.Privilege;

namespace GoodFood.Auth.Infrastructure.Dto.Employe
{
    public abstract class EmployeBase
    {
        [JsonProperty("nom")]
        public string Nom {get; set;}

        [JsonProperty("prenom")]
        public string Prenom {get; set;}

        [JsonProperty("email")]
        public string Email {get; set;}

        [JsonProperty("telephoneMobile")]
        public string TelephoneMobile {get; set;}

        [JsonProperty("franchise")]
        public FranchiseBase Franchise {get; set;}

        [JsonProperty("privileges")]
        public ICollection<PrivilegeBase> Privileges {get; set;}
    }
}