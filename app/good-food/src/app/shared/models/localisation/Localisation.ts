import * as _ from 'lodash';
import { Adresse, IAdresse } from '../adresse/adresse';

export interface ILocalisation{
  id?: number;
  adresse?: IAdresse;
  preferee?: boolean;
}

export default class Localisation{
  id?: number;
  adresse?: Adresse;
  preferee?: boolean;

  constructor(args?: ILocalisation){
    Object.assign(this, _.omit(args, ['adresse']));

    if (args.adresse){
      this.adresse = new Adresse(args.adresse);
    }
  }
}
