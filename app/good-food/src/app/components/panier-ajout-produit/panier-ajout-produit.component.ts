import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Formule } from 'src/app/shared/models/formule';
import { IProduit, Produit } from 'src/app/shared/models/produit';

@Component({
  selector: 'gf-panier-ajout-produit',
  templateUrl: './panier-ajout-produit.component.html',
  styleUrls: ['./panier-ajout-produit.component.scss']
})
export class PanierAjoutProduitComponent implements OnInit {

  @Input() public produitSelected: Produit;
  @Output() public formuleSelected: EventEmitter<any> = new EventEmitter<any>();
  infosFormule: Formule;
  listFormule: Formule[] = [];
  prixTotal: number = 0.00;
  idFormuleSelected: number;


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

  recupereFormuleARemplir(index:number): void{
    this.idFormuleSelected = index;
    this.formuleSelected.emit(this.listFormule[this.idFormuleSelected]);
  }

}
