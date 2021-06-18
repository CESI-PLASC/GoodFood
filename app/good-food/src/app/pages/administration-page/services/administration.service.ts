import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { RESS_FRANCHISES } from 'src/app/shared/constants/ressources.contants';
import { Formule, IFormule } from 'src/app/shared/models/formule/formule';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AdministrationService {

  constructor(private readonly http: HttpClient) {}

  public getFormulesByIdFranchise(idFranchise: number): Observable<Formule[]>{
    return this.http.get<{content: IFormule[]}>(`${RESS_FRANCHISES}/${idFranchise}/formules`)
        .pipe(map(reponse => reponse.content.map(formule => new Formule(formule))));
  }
}
