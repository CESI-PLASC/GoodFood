import * as _ from 'lodash';
import {
  MethodePaiementCarte,
  MethodePaiementCarteArgs,
  MethodePaiementCarteCreer,
} from './methode-paiement-carte';

export type MethodePaiementCreerSansUtilisateur = Omit<
  MethodePaiementCreer,
  'utilisateurId'
>;

export type MethodePaiementCreer = {
  type: 'carte';
  carte: MethodePaiementCarteCreer;
  utilisateurId: number;
};

export type MethodePaiementArgs = {
  id: string;
  type: string;
  carte?: MethodePaiementCarteArgs;
};

export default class MethodePaiement {
  id: string;
  type: string;
  carte?: MethodePaiementCarte;

  constructor(args: MethodePaiementArgs) {
    Object.assign(this, _.omit(args, ['carte']));

    if (args.carte) {
      this.carte = new MethodePaiementCarte(args.carte);
    }
  }
}
