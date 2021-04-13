import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { IProduit, ISimpleProduit } from '../../shared/models/produit';

@Component({
  selector: 'gf-produit-list',
  templateUrl: './produit-list.component.html',
  styleUrls: ['./produit-list.component.scss']
})
export class ProduitListComponent implements OnInit {

  @Input() public produits: ISimpleProduit[];
  produit: ISimpleProduit;
  @Output() public produitSelected: EventEmitter<any> = new EventEmitter<any>();

  constructor() { }

  ngOnInit(): void {
  }

  recupProduitSelected(item: IProduit): void{
    this.produitSelected.emit(item);
    //console.log(item);
  }
}
