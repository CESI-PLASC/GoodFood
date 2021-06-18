import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { RESS_PRODUITS } from 'src/app/shared/constants/ressources.contants';
import { Produit } from 'src/app/shared/models/produit/produit';

const headers = new HttpHeaders().set("Content-Type", "application/json");

@Injectable({
  providedIn: 'root'
})

export class AdministrationProduitsService {

  constructor(private readonly http: HttpClient) {}


  public deleteProduit(idproduit: number): void{
    this.http.delete<Produit>(`${RESS_PRODUITS}/${idproduit}`)
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
