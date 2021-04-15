import { Produit } from '../produit/produit';

export interface IContient{
  id?: {contenuId: number; produitId: number};
  produit?: Produit;
  quantite?: number;
}

export class Contient implements IContient{
  id?: IContient['id'];
  produit?: Produit;
  quantite?: number;

  constructor(opts?: Partial<IContient>){
    Object.assign(this, opts);
  }
}
