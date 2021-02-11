import { IFormule } from "./formule";
import { IProduit } from "./produit";

export type IPanierProduit = Pick<IProduit, "id" | "designation"> & {
  quantite?: number;
}

export type IPanierFormule = Pick<IFormule, "designation" | "prix" | "id"> & {
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

  public tousLesProduits(): IPanierProduit[]{
    return [].concat.apply([], this.formules.map(formule => formule.produits)) as IPanierProduit[];
  }

  public nombreProduits(): number{
    return this.tousLesProduits().length;
  }

  public prix(): number{
    return this.formules
      .map(formule => formule.prix)
      .reduce((prixTotal, prix) => prixTotal + prix)
    ;
  }
}
