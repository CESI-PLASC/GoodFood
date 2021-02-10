import { Component, OnInit } from '@angular/core';
import { Panier } from './services/commande.service';

@Component({
  selector: 'app-valider-panier-page',
  templateUrl: './valider-panier-page.component.html',
  styleUrls: ['./valider-panier-page.component.scss']
})
export class ValiderPanierPageComponent implements OnInit {

  panier: Panier = {
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
  }

  constructor() { }

  ngOnInit(): void {
  }

}
