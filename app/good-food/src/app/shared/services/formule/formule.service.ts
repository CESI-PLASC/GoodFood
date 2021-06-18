import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { RESS_FORMULES } from '../../constants/ressources.contants';
import { Formule, FormuleArgs } from '../../models/formule/formule';

@Injectable({
  providedIn: 'root',
})
export class FormuleService {
  constructor(private readonly http: HttpClient) {}

  public formules(): Observable<Formule[]> {
    return this.http
      .get<{ content: FormuleArgs[] }>(`${RESS_FORMULES}`)
      .pipe(
        map((reponse) => reponse.content.map((formule) => new Formule(formule)))
      );
  }
}
