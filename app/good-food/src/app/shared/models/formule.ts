export interface IFormule{
  designation?: string;
  prix?: number;
  id?: number;
}

export class Formule implements IFormule{
  id?: number;
  prix?: number;
  designation?: string;
  constructor(opt?: Partial<IFormule>){
    Object.assign(this, opt);
  }
}
