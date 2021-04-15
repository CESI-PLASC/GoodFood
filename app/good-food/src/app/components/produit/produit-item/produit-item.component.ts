import { Component, Input, EventEmitter, Output } from '@angular/core';
import { IProduit } from '../../../shared/models/produit/produit';
import { Icons } from '../../../shared/constants/icons.constant';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';

registerLocaleData(localeFr);

@Component({
  selector: 'gf-produit-item',
  templateUrl: './produit-item.component.html',
  styleUrls: ['./produit-item.component.scss']
})
export class ProduitItemComponent {
  public readonly icons = Icons.produits;
  @Input() public produit: IProduit;
  @Output() public produitSelected: EventEmitter<any> = new EventEmitter<any>();

  ajouterProduitPanier(item: IProduit) : void {
    this.produitSelected.emit(item);
  }

}
