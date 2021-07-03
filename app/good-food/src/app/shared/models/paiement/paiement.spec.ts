import Paiement from './paiement';

describe('Paiement', () => {
  it('Should create an instance', () => {
    expect(new Paiement({idPaiementMethode: '', idCommande: null})).toBeDefined();
  });
});
