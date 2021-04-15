import Utilisateur from './Utilisateur';

describe('Utilisateur', () => {
  it('should create an instance', () => {
    expect(new Utilisateur({ localisations: [] })).toBeDefined();
  });
});
