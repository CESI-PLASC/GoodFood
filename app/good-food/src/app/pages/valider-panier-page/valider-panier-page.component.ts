import { Component, OnInit } from '@angular/core';
import { IPanier } from 'src/app/shared/models/panier';

@Component({
  selector: 'app-valider-panier-page',
  templateUrl: './valider-panier-page.component.html',
  styleUrls: ['./valider-panier-page.component.scss']
})
export class ValiderPanierPageComponent implements OnInit {

  public panier: IPanier;

  constructor() { }

  ngOnInit(): void {
    this.panier = {
      dateCreation: new Date(),
      dateDonnee: new Date(),
      formules: [...new Array(10).keys()].map(idx => ({
        designation: `Ma formule de test n°${idx}`,
        prix: Math.round(Math.random() * 10000) / 100,
        produits: [...new Array(10).keys()].map(idx => ({
          id: idx,
          quantite: Math.floor(Math.random() * 10 + 1)
        }))
      }))
    };
  }

}
