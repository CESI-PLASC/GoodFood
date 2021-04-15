import * as _ from 'lodash';
import * as moment from 'moment';
import { Moment } from 'moment';
import { Contenu, IContenu } from '../contenu/Contenu';
import { Contient } from '../contient/Contient';
import { Formule } from '../formule/formule';
import { Franchise, IFranchise } from '../franchise/franchise';
import Statut, { IStatut } from '../statut/Statut';
import Utilisateur, { IUtilisateur } from '../utilisateur/Utilisateur';
import { Adresse, IAdresse } from '../adresse/adresse';

export type CommandeArgs = Pick<ICommande, 'id' | 'formules' | 'statut' | 'franchise' | 'utilisateur'> & {
  dateCreation?: string;
  dateDonnee?: string;
};

export interface ICommande{
  id?: number;
  dateCreation?: Moment;
  dateDonnee?: Moment;
  formules?: IContenu[];
  statut?: IStatut;
  franchise?: IFranchise;
  utilisateur?: IUtilisateur;
  adresseLivraison?: IAdresse;
  adresseFacturation?: IAdresse;
}

export class Commande implements ICommande{
  id?: number;
  dateCreation?: Moment;
  dateDonnee?: Moment;
  formules?: Contenu[];
  statut?: Statut;
  franchise?: Franchise;
  utilisateur?: Utilisateur;
  adresseLivraison?: Adresse;
  adresseFacturation?: Adresse;

  constructor(opts?: CommandeArgs){
    Object.assign(this, _.omit(opts, ['formules', 'statut', 'franchise', 'dateDonnee', 'dateCreation']));

    if (opts.dateDonnee){
      this.dateDonnee = moment(opts.dateDonnee, 'YYYY-MM-DD');
    }
    if (opts.dateCreation){
      this.dateCreation = moment(opts.dateCreation, 'YYYY-MM-DD');
    }

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