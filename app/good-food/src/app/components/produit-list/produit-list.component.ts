import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Formule } from 'src/app/shared/models/formule';
import { IProduit, ISimpleProduit, Produit } from '../../shared/models/produit';

@Component({
  selector: 'gf-produit-list',
  templateUrl: './produit-list.component.html',
  styleUrls: ['./produit-list.component.scss']
})
export class ProduitListComponent implements OnInit {

  @Input() public produits: ISimpleProduit[];
  @Input() public formulesChoisies: Formule[];
  produit: ISimpleProduit;
  @Output() public produitSelected: EventEmitter<any> = new EventEmitter<any>();

  constructor() { }

  ngOnInit(): void {
  }

  recupProduitSelected(item: IProduit): void{
    this.produitSelected.emit(item);
  }



}
