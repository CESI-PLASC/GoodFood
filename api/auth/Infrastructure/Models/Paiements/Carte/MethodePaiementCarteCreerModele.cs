namespace GoodFood.Auth.Infrastructure.Models.Paiements.Carte
{
    public class MethodePaiementCarteCreerModele
    {
        public long expireAnnee {get; set;}
        public long expireMois {get; set;}
        public string numero {get; set;}
        public string cvc {get; set;}
    }
}