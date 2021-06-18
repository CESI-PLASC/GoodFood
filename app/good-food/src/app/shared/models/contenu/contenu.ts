import { Contient } from '../contient/contient';
import { Formule } from '../formule/formule';

export type ContenuCreer = {
  formule: {
    id: number;
  };
  commande: {
    id: number;
  };
};

export interface IContenu {
  id?: number;
  formule?: Formule;
  produits?: Contient[];
}

export class Contenu implements IContenu {
  id?: number;
  formule?: Formule;
  produits?: Contient[];

  constructor(opts?: Partial<IContenu>) {
    Object.assign(this, opts);
  }
}
