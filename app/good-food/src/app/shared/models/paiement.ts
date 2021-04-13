export type PaiementArgs = Pick<Paiement, "client_secret">

export default class Paiement{
  client_secret: string;

  constructor(args: PaiementArgs){
    Object.assign(this, args);
  }
}
