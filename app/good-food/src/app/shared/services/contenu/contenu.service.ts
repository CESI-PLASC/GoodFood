import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RESS_CONTENUS } from '../../constants/ressources.contants';
import { Contenu, ContenuCreer, IContenu } from '../../models/contenu/contenu';

@Injectable({
  providedIn: 'root',
})
export class ContenuService {
  constructor(private readonly http: HttpClient) {}

  public creer(contenu: ContenuCreer): Observable<IContenu> {
    return this.http.post<IContenu>(RESS_CONTENUS, contenu);
  }

  public supprimer(contenuId: number): Observable<{}> {
    return this.http.delete<{}>(`${RESS_CONTENUS}/${contenuId}`);
  }
}
