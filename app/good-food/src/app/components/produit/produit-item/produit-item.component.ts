import { Component, Input } from '@angular/core';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
import { PanierService } from 'src/app/pages/catalogue-page/services/panier.service';
import { Icons } from '../../../shared/constants/icons.constant';
import { IProduit } from '../../../shared/models/produit/produit';

registerLocaleData(localeFr);

@Component({
  selector: 'gf-produit-item',
  templateUrl: './produit-item.component.html',
  styleUrls: ['./produit-item.component.scss']
})
export class ProduitItemComponent {
  public readonly icons = Icons.produits;
  @Input() public produit: IProduit;

  constructor(public panierService: PanierService) { }

  ajouterProduitPanier(item: IProduit) : void{
    this.panierService.addProduit(item);
  }

}
