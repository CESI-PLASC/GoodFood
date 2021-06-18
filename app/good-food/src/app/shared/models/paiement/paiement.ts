export type PaiementArgs = Pick<Paiement, 'idCommande' | 'idPaiementMethode'>;

export default class Paiement {
  idCommande: number;
  idPaiementMethode: string;

  constructor(args: PaiementArgs) {
    Object.assign(this, args);
  }
}
