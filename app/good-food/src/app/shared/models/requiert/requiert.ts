import * as _ from 'lodash';
import { Categorie, ICategorie } from '../categorie/categorie';

export type RequiertArgs = IRequiert;

export type IRequiert = {
  id?: {
    categorieId?: number;
    formuleId?: number;
  };
  categorie?: ICategorie;
  quantite?: number;
};

export default class Requiert implements IRequiert {
  id?: {
    categorieId?: number;
    formuleId?: number;
  };
  categorie?: ICategorie;
  quantite?: number;

  constructor(args?: RequiertArgs) {
    Object.assign(this, _.omit(args, ['categorie']));

    this.categorie = args.categorie ? new Categorie(args.categorie) : undefined;
  }
}
