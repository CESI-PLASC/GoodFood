import { Produit } from './produit';
import { Categorie } from '../categorie/categorie';

describe('Produit', () => {
  it('Should create an instance', () => {
    expect(new Produit({
      categorie: new Categorie()
    })).toBeDefined();
  });
});
