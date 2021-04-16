using auth.Models.paiements.carte;

namespace auth.Models.paiements
{
    public class MethodePaiementCreerModele
    {
        public string type { get; set; }
        public long utilisateurId { get; set; }
        public MethodePaiementCarteCreerModele carte { get; set; }
    }
}