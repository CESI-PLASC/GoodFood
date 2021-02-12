export interface ICommande{
  id?: number;
  dateCreation?: Date;
  dateDonnee?: Date;
}

export class Commande implements ICommande{
  id?: number;
  dateCreation?: Date;
  dateDonnee?: Date;

  constructor(opts?: Partial<ICommande>){
    Object.assign(this, opts);
  }
}
