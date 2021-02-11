export interface ICommande{
  id?: number;
  dateCreation?: Date;
  dateDonnee?: Date;
}

export class Commande implements ICommande{
  id?: ICommande["id"];
  dateCreation?: ICommande["dateCreation"];
  dateDonnee?: ICommande["dateDonnee"];

  constructor(opts?: Partial<ICommande>){
    Object.assign(this, opts);
  }
}
