import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Franchise, IFranchise } from 'src/app/shared/models/franchise/franchise';
import { Observable } from 'rxjs/internal/Observable';
import { RESS_FRANCHISES } from 'src/app/shared/constants/ressources.contants';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class FranchiseService {

  constructor(private readonly http: HttpClient) {}

  public getFranchises(): Observable<Franchise[]>{
    return this.http.get<{content: IFranchise[]}>(RESS_FRANCHISES)
        .pipe(map(reponse => reponse.content.map(franchise => new Franchise(franchise))));
  }

  public getFranchise(idFranchise: number): Observable<Franchise>{
    return this.http.get<IFranchise>(`${RESS_FRANCHISES}/${idFranchise}`).pipe(map(franchise => new Franchise(franchise)));
  }
}
