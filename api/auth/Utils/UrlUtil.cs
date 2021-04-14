namespace auth.Utils
{
    public class UrlUtil
    {
        private const string CURRENT_VERSION = "v1";
        private const string BASE_API_URL = "api/" + CURRENT_VERSION;

        public static class RESSOURCES_NAMES
        {
            public const string FRANCHISE = "Franchise";
        }

        public static class FRANCHISE_RESSOURCE
        {
            public const string FRANCHISES = BASE_API_URL + "/franchises";
            public const string FRANCHISE = FRANCHISES + "/{idFranchise}";
        }

        public static class PAIEMENT_RESSOURCE
        {
            public const string PAIEMENTS = BASE_API_URL + "/paiements";
            public const string INTENT = PAIEMENTS + "/intent/{idCommande}";
            public const string UTILISATEURS = PAIEMENTS + "/utilisateurs";
            public const string METHODES = UTILISATEURS + "/{idUtilisateur}/methodes";
        }
    }
}