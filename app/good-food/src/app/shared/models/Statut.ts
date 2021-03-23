export interface IStatut{
  id?: number;
  designation?: string;
}

export default class Statut implements IStatut{
  id?: number;
  designation?: string;

  constructor(args: Partial<Statut>){
    Object.assign(this, args);
  }
}
