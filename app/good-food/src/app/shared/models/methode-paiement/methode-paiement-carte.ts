export type MethodePaiementCarteArgs = {
  marque: string;
  pays: string;
  expireMois: number;
  expireAnnee: number;
  derniersChiffres: string;
};

export class MethodePaiementCarte{
  marque: string;
  pays: string;
  expireMois: number;
  expireAnnee: number;
  derniersChiffres: string;

  constructor(args: MethodePaiementCarteArgs){
    Object.assign(this, args);
  }
}
