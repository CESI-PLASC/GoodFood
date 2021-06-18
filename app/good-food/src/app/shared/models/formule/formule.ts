import * as _ from 'lodash';
import { IProduit } from '../produit/produit';
import Requiert, { RequiertArgs } from '../requiert/requiert';

export type FormuleCreer = Pick<Formule, 'designation' | 'prix'>;

export type FormuleArgs = Pick<IFormule, 'designation' | 'prix' | 'id'> & {
  structure: RequiertArgs[];
};

export interface IFormule {
  designation?: string;
  prix?: number;
  id?: number;
  structure?: Requiert[];
}

export class Formule implements IFormule {
  id?: number;
  prix?: number;
  designation?: string;
  structure?: Requiert[];
  constructor(opt?: FormuleArgs) {
    Object.assign(this, _.omit(opt, ['structure']));

    this.structure =
      opt.structure?.map((requiert) => new Requiert(requiert)) || [];
  }
}

export interface IFormuleWithProducts extends IFormule {
  produits: IProduit[];
}
