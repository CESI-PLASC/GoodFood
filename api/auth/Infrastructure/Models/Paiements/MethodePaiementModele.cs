using GoodFood.Auth.Infrastructure.Models.Paiements.Carte;

namespace GoodFood.Auth.Infrastructure.Models.Paiements
{
    public class MethodePaiementModele
    {
        public string id { get; set; }
        public string type { get; set; }
        public MethodePaiementCarteModele carte { get; set; }
    }
}