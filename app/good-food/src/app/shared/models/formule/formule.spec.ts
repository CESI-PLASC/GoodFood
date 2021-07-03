import { Formule } from './formule';

describe('Formule', () => {
  it('Should create an instance', () => {
    expect(new Formule({structure: []})).toBeDefined();
  });
});
