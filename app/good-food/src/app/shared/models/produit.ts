import { ICategorie } from './categorie';

export interface IProduit {
    id?: number;
    prix?: number;
    designation?: string;
    categories?: ICategorie[];
}

export class Produit implements IProduit {
    id?: number;
    prix?: number;
    designation?: string;
    categories?: ICategorie[];
    constructor(opt?: Partial<IProduit>) {
        Object.assign(this, opt);
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
