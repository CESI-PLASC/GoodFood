import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ICategorie } from '../../../shared/models/categorie';
import { JAVA_URL } from '../../../shared/constants/url.constant';

@Injectable({
  providedIn: 'root'
})
export class CatalogueService {

  private readonly resourceUrl = `${JAVA_URL}`;

  constructor(private readonly http: HttpClient) { }

  public getByFranchiseId(id: number): Observable<ICategorie[]> {
    return this.http.get<ICategorie[]>(`${this.resourceUrl}/franchises/${id}/catalogue`);
  }

}
