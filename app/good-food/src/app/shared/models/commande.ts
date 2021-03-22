import { Contenu } from "./Contenu";
import { Contient } from "./Contient";

export interface ICommande{
  id?: number;
  dateCreation?: Date;
  dateDonnee?: Date;
  formules?: Contenu[];
}

export class Commande implements ICommande{
  id?: number;
  dateCreation?: Date;
  dateDonnee?: Date;
  formules?: Contenu[];

  constructor(opts?: Partial<ICommande>){
    Object.assign(this, opts);
  }

  public tousLesProduits(): Contient[]{
    return [].concat.apply([], this.formules.map(formule => formule.produits));
  }

  public nombreProduits(): number{
    return this.tousLesProduits().length;
  }

  public prix(): number{
    return this.formules
      .map(formule => formule.formule.prix)
      .reduce((prixTotal, prix) => prixTotal + prix)
    ;
  }
}
