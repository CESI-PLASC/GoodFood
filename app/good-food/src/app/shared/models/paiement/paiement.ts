export type PaiementArgs = Pick<Paiement, 'clientSecret'>;

export default class Paiement{
  clientSecret: string;

  constructor(args: PaiementArgs){
    Object.assign(this, args);
  }
}
