using System.Net.Http;
using System.Threading.Tasks;
using GoodFood.Auth.Infrastructure.Dto.Commande;
using GoodFood.Auth.Infrastructure.Models;
using Microsoft.Extensions.Configuration;
using Newtonsoft.Json;

namespace GoodFood.Auth.Infrastructure.Services.Commande
{
    public class CommandeService: ICommandeService
    {
        private string JAVA_URL;

        public CommandeService(IConfiguration configuration)
        {
            this.JAVA_URL = configuration.GetValue<string>("JAVA_API:JAVA_URL");
        }

        public async Task<CommandeModele> one(int idCommande)
        {
            CommandeModele commande;
            using (HttpClient httpClient = new HttpClient())
            {
                using (HttpResponseMessage response = await httpClient.GetAsync($"{JAVA_URL}/api/commandes/{idCommande}"))
                {
                    string jsonstr = await response.Content.ReadAsStringAsync();
                    commande = JsonConvert.DeserializeObject<CommandeModele>(jsonstr);
                }
            }

            return commande;
        }

        public async Task<double> prix(int idCommande)
        {
            double prix;
            using (HttpClient httpClient = new HttpClient())
            {
                using (HttpResponseMessage response = await httpClient.GetAsync($"{JAVA_URL}/api/commandes/{idCommande}/prix"))
                {
                    string jsonstr = await response.Content.ReadAsStringAsync();
                    prix = JsonConvert.DeserializeObject<CommandePriceDTO>(jsonstr).prix;
                }
            }

            return prix;
        }
    }
}