using GoodFood.Auth.Models.Paiements.Carte;

namespace GoodFood.Auth.Models.Paiements
{
    public class MethodePaiementCreerModele
    {
        public string type { get; set; }
        public long utilisateurId { get; set; }
        public MethodePaiementCarteCreerModele carte { get; set; }
    }
}