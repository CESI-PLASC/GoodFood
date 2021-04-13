import * as _ from "lodash";
import { Contenu, IContenu } from "./Contenu";
import { Contient } from "./Contient";
import { Formule } from "./formule";
import { Franchise, IFranchise } from "./franchise";
import Statut, { IStatut } from "./Statut";

export interface ICommande{
  id?: number;
  dateCreation?: Date;
  dateDonnee?: Date;
  formules?: IContenu[];
  statut?: IStatut;
  franchise?: IFranchise;
}

export class Commande implements ICommande{
  id?: number;
  dateCreation?: Date;
  dateDonnee?: Date;
  formules?: Contenu[];
  statut?: Statut;
  franchise?: Franchise;

  constructor(opts?: Partial<ICommande>){
    Object.assign(this, _.omit(opts, ["formules", "statut", "franchise"]));

    this.formules = opts.formules ? opts.formules.map(formule => new Formule(formule)) : [];
    this.statut = opts.statut ? new Statut(opts.statut) : undefined;
    this.franchise = opts.franchise ? new Franchise(opts.franchise) : undefined;
  }

  public tousLesProduits(): Contient[]{
    return [].concat.apply([], this.formules.map(formule => formule.produits));
  }

  public nombreProduits(): number{
    return this.tousLesProduits().length;
  }

  public prix(): number{
    return this.formules
      .reduce((prixTotal, formule) => prixTotal + formule.formule.prix, 0)
    ;
  }
}
