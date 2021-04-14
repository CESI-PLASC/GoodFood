namespace auth.Models.paiements
{
    public class PaiementMethodeModel
    {
        public string id { get; set; }
        public string derniersChiffres { get; set; }
        public long expireMois { get; set; }
        public long expireAnnee { get; set; }
    }
}