export interface IPanierProduit{
  id?: number;
  quantite?: number;
}

export interface IPanierFormule{
  designation?: string;
  prix?: number;
  produits?: IPanierProduit[]
}

export interface IPanier {
  id?: number;
  dateCreation?: Date;
  dateDonnee?: Date;
  formules?: IPanierFormule[]
}

export class Panier implements IPanier{
  id?: IPanier["id"];
  dateCreation?: IPanier["dateCreation"];
  dateDonnee?: IPanier["dateDonnee"];
  formules?: IPanier["formules"];
  constructor(opt?: Partial<IPanier>) {
    Object.assign(this, opt);
  }
}
