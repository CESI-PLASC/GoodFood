import { Contient } from '../contient/Contient';
import { Formule } from '../formule/formule';

export interface IContenu{
  id?: number;
  formule?: Formule;
  produits?: Contient[];
}

export class Contenu implements IContenu{
  id?: number;
  formule?: Formule;
  produits?: Contient[];

  constructor(opts?: Partial<IContenu>){
    Object.assign(this, opts);
  }
}
