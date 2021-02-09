import { Component, Input, OnInit } from '@angular/core';
import { Formule } from '../une-formule/une-formule.component';

@Component({
  selector: 'app-mon-panier',
  templateUrl: './mon-panier.component.html',
  styleUrls: ['./mon-panier.component.scss']
})
export class MonPanierComponent implements OnInit {

  @Input() idCommande: number;
  formules: Formule[] = [{
    designation: "Ma formule de test",
    prix: 14.99,
    produits: ["test", "test2"]
  }, {
    designation: "Ma formule de test 2",
    prix: 14.99,
    produits: ["test", "test2"]
  }];

  constructor() { }

  ngOnInit(): void {
  }

}
