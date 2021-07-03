import Utilisateur from './utilisateur';

describe('Utilisateur', () => {
  it('Should create an instance', () => {
    expect(new Utilisateur({ localisations: [] })).toBeDefined();
  });
});
