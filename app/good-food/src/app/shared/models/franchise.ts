import { Adresse, IAdresse } from "./adresse";
import {omit} from "lodash";

export interface IFranchise {
  id?: number;
  designation?: string;
  telephoneFixe?: string | null;
  telephonePortable?: string | null;
  email?: string;
  adresse?: IAdresse;
}

export class Franchise implements IFranchise{
    id?: number;
    designation?: string;
    telephoneFixe?: string | null;
    telephonePortable?: string | null;
    email?: string;
    adresse?: Adresse;
    constructor(opt?: Partial<IFranchise>) {
      Object.assign(this, omit(opt, "adresse"));
      this.adresse = new Adresse(opt.adresse);
    }
}
