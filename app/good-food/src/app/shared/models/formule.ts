export interface IFormule{
  designation?: string;
  prix?: number;
  id?: number;
}

export class Formule implements IFormule{
  id?: IFormule["id"];
  prix?: IFormule["prix"]
  designation?: IFormule["designation"]
  constructor(opt?: Partial<IFormule>){
    Object.assign(this, opt);
  }
}
