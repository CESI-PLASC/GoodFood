import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RESS_FORMULES } from 'src/app/shared/constants/ressources.contants';
import { Formule } from 'src/app/shared/models/formule/formule';

@Injectable({
  providedIn: 'root'
})
export class AdministrationFormulesService {

  constructor(private readonly http: HttpClient) {}


  public deleteFormule(idFormule: number): void{
    console.log(idFormule);
    this.http.delete<Formule>(`${RESS_FORMULES}/${idFormule}`)
    .subscribe(
      val => {
          console.log("PUT call successful value returned in body",
                      val);
      },
      response => {
          console.log("PUT call in error", response);
      },
      () => {
          console.log("The PUT observable is now completed.");
      }
    );
  }
}
