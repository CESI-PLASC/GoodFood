import * as _ from 'lodash';
import * as moment from 'moment';
import { Moment } from 'moment';
import { Contenu, IContenu } from '../contenu/contenu';
import { Contient } from '../contient/contient';
import { Franchise, IFranchise } from '../franchise/franchise';
import Statut, { IStatut } from '../statut/statut';
import Utilisateur, { IUtilisateur } from '../utilisateur/utilisateur';
import { Adresse, IAdresse } from '../adresse/adresse';

export type CommandeArgs = Pick<
  ICommande,
  'id' | 'formules' | 'statut' | 'franchise' | 'utilisateur'
> & {
  dateCreation?: string;
  dateDonnee?: string;
};

export interface ICommande {
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

export class Commande implements ICommande {
  id?: number;
  dateCreation?: Moment;
  dateDonnee?: Moment;
  formules?: Contenu[];
  statut?: Statut;
  franchise?: Franchise;
  utilisateur?: Utilisateur;
  adresseLivraison?: Adresse;
  adresseFacturation?: Adresse;

  constructor(opts?: CommandeArgs) {
    Object.assign(
      this,
      _.omit(opts, [
        'formules',
        'statut',
        'franchise',
        'dateDonnee',
        'dateCreation',
      ])
    );

    this.dateDonnee = opts.dateDonnee
      ? moment(opts.dateDonnee, 'YYYY-MM-DD')
      : undefined;
    this.dateCreation = opts.dateCreation
      ? moment(opts.dateCreation, 'YYYY-MM-DD')
      : undefined;

    this.formules = opts.formules?.map((formule) => new Contenu(formule)) || [];
    this.statut = opts.statut ? new Statut(opts.statut) : undefined;
    this.franchise = opts.franchise ? new Franchise(opts.franchise) : undefined;
  }

  public tousLesProduits(): Contient[] {
    return [].concat.apply(
      [],
      this.formules.map((formule) => formule.produits)
    );
  }

  public nombreProduits(): number {
    return this.tousLesProduits().length;
  }

  public prix(): number {
    return this.formules.reduce(
      (prixTotal, formule) => prixTotal + formule.formule.prix,
      0
    );
  }

  /**
   * Permet de vérifier que le contenu de la commande est valide selon la structure des formules
   * @returns Vrai si la structure des formules est respectée
   */
  public structureValide(): boolean {
    let estValide = true;
    for (const contenu of this.formules) {
      const {
        produits,
        formule: { structure },
      } = contenu;

      // Quantités par catégorie
      const quantites: Record<number, number> = {};
      for (const requiert of structure) {
        const categorieId = requiert.categorie.id;
        if (!(requiert.categorie.id in quantites)) {
          quantites[requiert.categorie.id] = 0;
        }
        quantites[categorieId] += requiert.quantite;
      }

      // Analyse des produits de la formule
      for (const contenu of produits) {
        const categorieId = contenu.produit.categorie.id;

        // Trop de produit pour la catégorie
        if (
          !(categorieId in quantites) ||
          quantites[categorieId] - contenu.quantite < 0
        ) {
          estValide = false;
          break;
        }

        // Retire le nombre de produits de la catégorie
        else {
          quantites[categorieId] -= contenu.quantite;

          // Supprime la catégorie car limite de quantité autorisée atteinte
          if (quantites[categorieId] === 0) {
            delete quantites[categorieId];
          }
        }
      }

      // Si il manque des produits
      if (!_.isEmpty(quantites)) {
        estValide = false;
      }

      // Ne vérifie pas les autres formules car n'est pas correct de toutes façons
      if (!estValide) {
        break;
      }
    }

    return estValide;
  }
}
