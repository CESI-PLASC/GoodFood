using System.Collections.Generic;
using GoodFood.Auth.Infrastructure.Models;
using Xunit;

namespace auth.UnitTests.models
{
    public class UtilisateurModeleTest
    {
        [Fact]
        public void test_creation()
        {
            List<string> mocks = new List<string>{
                "Mon nom",
                "Mon prénom",
                "2021/01/01",
                "test@test.test",
                "0606060606",
                "0606060606",
                "fakeStripeKey"
            };

            UtilisateurModele utilisateur = new UtilisateurModele
            {
                nom = mocks[0],
                prenom = mocks[1],
                dateNaissance = mocks[2],
                email = mocks[3],
                telephoneFixe = mocks[4],
                telephoneMobile = mocks[5],
                stripe = mocks[6]
            };

            Assert.Equal(mocks[0], utilisateur.nom);
            Assert.Equal(mocks[1], utilisateur.prenom);
            Assert.Equal(mocks[2], utilisateur.dateNaissance);
            Assert.Equal(mocks[3], utilisateur.email);
            Assert.Equal(mocks[4], utilisateur.telephoneFixe);
            Assert.Equal(mocks[5], utilisateur.telephoneMobile);
            Assert.Equal(mocks[6], utilisateur.stripe);
        }
    }
}