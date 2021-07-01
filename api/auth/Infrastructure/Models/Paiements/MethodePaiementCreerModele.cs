using GoodFood.Auth.Infrastructure.Models.Paiements.Carte;

namespace GoodFood.Auth.Infrastructure.Models.Paiements
{
    public class MethodePaiementCreerModele
    {
        public string type { get; set; }
        public long utilisateurId { get; set; }
        public MethodePaiementCarteCreerModele carte { get; set; }
    }
}