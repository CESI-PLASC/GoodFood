import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RESS_CONTIENTS } from '../../constants/ressources.contants';
import {
  Contient,
  ContientCreer,
  ContientModifier,
  IContient,
} from '../../models/contient/contient';

@Injectable({
  providedIn: 'root',
})
export class ContientService {
  constructor(private readonly http: HttpClient) {}

  public creer(contient: ContientCreer): Observable<IContient> {
    return this.http.post<IContient>(RESS_CONTIENTS, {
      id: contient.id,
      quantite: contient.quantite || 1,
      contenu: { id: contient.id.contenuId },
      produit: { id: contient.id.produitId },
    });
  }

  public modifier(contient: ContientModifier): Observable<IContient> {
    return this.http.put<IContient>(RESS_CONTIENTS, {
      id: contient.id,
      quantite: contient.quantite <= 0 ? 1 : contient.quantite,
    });
  }

  public supprimer(contenuId: number, produitId: number): Observable<{}> {
    return this.http.delete<{}>(`${RESS_CONTIENTS}/${contenuId}_${produitId}`);
  }
}
