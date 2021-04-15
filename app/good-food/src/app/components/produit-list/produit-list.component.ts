import { Component, Input, EventEmitter, Output} from '@angular/core';
import { ISimpleProduit, IProduit } from '../../shared/models/produit';

@Component({
  selector: 'gf-produit-list',
  templateUrl: './produit-list.component.html',
  styleUrls: ['./produit-list.component.scss']
})
export class ProduitListComponent {
  @Input() public produits: ISimpleProduit[];
  produit: ISimpleProduit;
  @Output() public produitSelected: EventEmitter<any> = new EventEmitter<any>();

  constructor() { }

  ngOnInit(): void {
  }

  recupProduitSelected(item: IProduit): void{
    this.produitSelected.emit(item);
  }
}
