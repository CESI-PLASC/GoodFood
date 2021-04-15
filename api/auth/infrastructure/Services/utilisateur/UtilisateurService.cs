using System.Net.Http;
using System.Threading.Tasks;
using auth.Models;
using Microsoft.Extensions.Configuration;
using Newtonsoft.Json;

namespace auth.infrastructure.Services.utilisateur
{
    public class UtilisateurService : IUtilisateurService
    {
        private string JAVA_URL;

        public UtilisateurService(IConfiguration configuration)
        {
            this.JAVA_URL = configuration.GetValue<string>("JAVA_API:JAVA_URL");
        }

        public async Task<UtilisateurModele> one(long idUtilisateur)
        {
            UtilisateurModele utilisateur;
            using (HttpClient httpClient = new HttpClient())
            {
                using (HttpResponseMessage response = await httpClient.GetAsync($"{JAVA_URL}/api/utilisateurs/{idUtilisateur}"))
                {
                    string jsonstr = await response.Content.ReadAsStringAsync();
                    utilisateur = JsonConvert.DeserializeObject<UtilisateurModele>(jsonstr);
                }
            }

            return utilisateur;
        }

        public async void update(UtilisateurModele utilisateur)
        {
            StringContent utilisateurStr = new StringContent(utilisateur.ToString());

            using (HttpClient httpClient = new HttpClient())
            {
                await httpClient.PutAsync($"{JAVA_URL}/api/utilisateurs/{utilisateur.id}", utilisateurStr);
            }
        }
    }
}