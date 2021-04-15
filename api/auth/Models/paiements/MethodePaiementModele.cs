namespace auth.Models.paiements
{
    public class MethodePaiementModele
    {
        public string id { get; set; }
        public string type { get; set; }
        public MethodePaiementCarteModele carte { get; set; }
    }
}