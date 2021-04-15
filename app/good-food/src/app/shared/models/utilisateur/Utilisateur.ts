import * as _ from 'lodash';
import Localisation, { ILocalisation } from '../localisation/Localisation';

export interface IUtilisateur{
  id?: number;
  nom?: string;
  prenom?: string;
  dateNaissance?: string;
  email?: string;
  telephoneFixe?: string | null;
  telephoneMobile?: string | null;
  localisations?: ILocalisation[];
}

export default class Utilisateur implements IUtilisateur{
  id?: number;
  nom?: string;
  prenom?: string;
  dateNaissance?: string;
  email?: string;
  telephoneFixe?: string | null;
  telephoneMobile?: string | null;
  localisations?: ILocalisation[];

  constructor(args?: IUtilisateur){
    Object.assign(this, _.omit(args, ['localisations']));

    this.localisations = args.localisations.map(localisation => new Localisation(localisation));
  }
}
