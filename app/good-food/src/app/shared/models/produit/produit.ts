import * as _ from 'lodash';
import { Categorie, ICategorie } from '../categorie/categorie';

export interface IProduit {
  id?: number;
  prix?: number;
  designation?: string;
  categorie?: ICategorie;
  est_supprime?: boolean;
}

export class Produit implements IProduit {
  id?: number;
  prix?: number;
  designation?: string;
  categorie?: Categorie;
  est_supprime?: boolean;
  constructor(opt?: Partial<IProduit>) {
    Object.assign(this, _.omit(opt, ['categorie']));

    this.categorie = opt.categorie ? new Categorie(opt.categorie) : undefined;
  }
}

export interface ISimpleProduit {
  id?: number;
  prix?: number;
  designation?: string;
  est_supprime?: boolean;
}

export class SimpleProduit implements ISimpleProduit {
  id?: number;
  prix?: number;
  designation?: string;
  est_supprime?: boolean;
  constructor(opt?: Partial<ISimpleProduit>) {
    Object.assign(this, opt);
  }
}
