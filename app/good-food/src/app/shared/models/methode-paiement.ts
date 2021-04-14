export type MethodePaiementArgs = {
  id: number;
  derniersChiffres: string;
  expireMois: number;
  expireAnnee: number;
  type: string;
}

export default class MethodePaiement{
  id: number;
  derniersChiffres: string;
  expireMois: number;
  expireAnnee: number;
  type: string;

  constructor(args: MethodePaiementArgs){
    Object.assign(this, args);
  }
}
