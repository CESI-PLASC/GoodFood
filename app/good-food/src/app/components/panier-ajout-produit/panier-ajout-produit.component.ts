import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Formule } from 'src/app/shared/models/formule';
import { IProduit, Produit } from 'src/app/shared/models/produit';

@Component({
  selector: 'gf-panier-ajout-produit',
  templateUrl: './panier-ajout-produit.component.html',
  styleUrls: ['./panier-ajout-produit.component.scss']
})
export class PanierAjoutProduitComponent implements OnInit {

  @Input() public produitsChoisis: IProduit[];
  @Output() public formuleSelected: EventEmitter<any> = new EventEmitter<any>();

  constructor() { }

  ngOnInit(): void {
  }

  actualiserProduits(produits: Produit[]): void{
    this.produitsChoisis = produits;
    const TOTAL = this.produitsChoisis.reduce(
      (sum,p)=>sum+p.prix,0
    )
    console.log("Test");
  }

}
