import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ICategorie } from '../../../shared/models/categorie/categorie';
import { RESS_FRANCHISES } from 'src/app/shared/constants/ressources.contants';

@Injectable({
  providedIn: 'root'
})
export class CatalogueService {

  constructor(private readonly http: HttpClient) { }

  public getByFranchiseId(id: number): Observable<ICategorie[]> {
    return this.http.get<ICategorie[]>(`${RESS_FRANCHISES}/${id}/catalogue`);
  }

}
