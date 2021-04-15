namespace auth.Models.paiements
{
    public class MethodePaiementCarteModele
    {
        public string marque {get; set;}
        public string pays {get; set;}
        public long expireMois {get; set;}
        public long expireAnnee {get; set;}
        public string derniersChiffres {get; set;}
    }
}