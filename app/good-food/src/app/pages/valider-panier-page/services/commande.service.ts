import { Injectable } from '@angular/core';

export type Panier = {
  dateCreation: Date;
  dateDonnee: Date;
  formules: {
    designation: string;
    prix: number;
    produits: {
      id: number;
      quantite: number;
    }[]
  }[]
}

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  constructor() { }
}
