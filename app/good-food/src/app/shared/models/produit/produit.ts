import * as _ from 'lodash';
import { Categorie, ICategorie } from '../categorie/categorie';

export interface IProduit {
  id?: number;
  prix?: number;
  designation?: string;
  categorie?: ICategorie;
}

export class Produit implements IProduit {
  id?: number;
  prix?: number;
  designation?: string;
  categorie?: Categorie;
  constructor(opt?: Partial<IProduit>) {
    Object.assign(this, _.omit(opt, ['categorie']));

    this.categorie = opt.categorie ? new Categorie(opt.categorie) : undefined;
  }
}

export interface ISimpleProduit {
  id?: number;
  prix?: number;
  designation?: string;
}

export class SimpleProduit implements ISimpleProduit {
  id?: number;
  prix?: number;
  designation?: string;
  constructor(opt?: Partial<ISimpleProduit>) {
    Object.assign(this, opt);
  }
}
