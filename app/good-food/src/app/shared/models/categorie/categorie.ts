import { IProduit } from '../produit/produit';

export interface ICategorie {
    id?: number;
    designation?: string;
    produits?: IProduit[];
}

export class Categorie implements ICategorie{
    id?: number;
    designation?: string;
    produits?: IProduit[];
    constructor(opt?: Partial<ICategorie>) {
        Object.assign(this, opt);
    }
}

export interface ISimpleCategorie {
    id?: number;
    designation?: string;
}

export class SimpleCategorie implements ISimpleCategorie{
    id?: number;
    designation?: string;
    constructor(opt?: Partial<ISimpleCategorie>) {
        Object.assign(this, opt);
    }
}
