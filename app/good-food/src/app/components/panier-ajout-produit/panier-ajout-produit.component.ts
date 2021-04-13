import { Component, Input, OnInit } from '@angular/core';
import { Formule } from 'src/app/shared/models/formule';
import { IProduit } from 'src/app/shared/models/produit';

@Component({
  selector: 'gf-panier-ajout-produit',
  templateUrl: './panier-ajout-produit.component.html',
  styleUrls: ['./panier-ajout-produit.component.scss']
})
export class PanierAjoutProduitComponent implements OnInit {

  @Input() public produitChoisi: IProduit;
  infosFormule: Formule;
  listFormule: Formule[] = [];
  prixTotal: number = 0.00;

  constructor() { }

  ngOnInit(): void {
  }

  actualiseTotal(formule: Formule[]): void{
    this.listFormule = formule;
    this.prixTotal = 0.00;
    formule.forEach(element => {
      this.prixTotal += element.prix;
    });
  }
}
