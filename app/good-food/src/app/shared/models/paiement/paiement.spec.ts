import Paiement from './paiement';

describe('Paiement', () => {
  it('should create an instance', () => {
    expect(new Paiement({ clientSecret: '' })).toBeDefined();
  });
});
