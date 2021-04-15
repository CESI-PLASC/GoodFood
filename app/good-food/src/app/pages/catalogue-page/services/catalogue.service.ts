import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ICategorie } from '../../../shared/models/categorie';
import { RESS_FORMULES, RESS_FRANCHISES } from 'src/app/shared/constants/ressources.contants';
import { Formule, IFormule } from 'src/app/shared/models/formule';
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class CatalogueService {

  constructor(private readonly http: HttpClient) { }

  public getByFranchiseId(id: number): Observable<ICategorie[]> {
    return this.http.get<ICategorie[]>(`${RESS_FRANCHISES}/${id}/catalogue`);
  }

  public getFormules(): Observable<Formule[]>{
    return this.http.get<{content: IFormule[]}>(`${RESS_FORMULES}`).pipe(map(reponse => reponse.content.map(formule => new Formule(formule))));
  }

}
