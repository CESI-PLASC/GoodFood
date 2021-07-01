import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import {
  RESS_METHODES_PAIEMENT,
  RESS_PAIEMENTS,
} from '../../../shared/constants/ressources.contants';
import MethodePaiement, {
  MethodePaiementArgs,
  MethodePaiementCreer,
} from '../../../shared/models/methode-paiement/methode-paiement';
import Paiement from 'src/app/shared/models/paiement/paiement';

@Injectable({
  providedIn: 'root',
})
export class ValiderPanierService {
  constructor(private readonly http: HttpClient) {}

  public methodesPaiementUtilisateur(
    idUtilisateur: number
  ): Observable<MethodePaiement[]> {
    return this.http
      .get<MethodePaiementArgs[]>(
        `${RESS_METHODES_PAIEMENT}/utilisateurs/${idUtilisateur}`
      )
      .pipe(
        map((reponse) =>
          reponse.map((rep: MethodePaiementArgs) => new MethodePaiement(rep))
        )
      );
  }

  public creerMethodePaiementUtilisateur(
    methodePaiement: MethodePaiementCreer
  ): Observable<MethodePaiement> {
    return this.http
      .post<MethodePaiementArgs>(
        `${RESS_METHODES_PAIEMENT}/utilisateurs`,
        methodePaiement
      )
      .pipe(map((reponse) => new MethodePaiement(reponse)));
  }

  public payerCommande(paiement: Paiement): Observable<{}> {
    return this.http.post<{}>(`${RESS_PAIEMENTS}/commandes`, paiement);
  }
}
