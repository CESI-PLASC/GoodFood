import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { IProduit, Produit } from '../../shared/models/produit';
import { Icons } from '../../shared/constants/icons.constant';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
import { Formule } from 'src/app/shared/models/formule';

registerLocaleData(localeFr);

@Component({
  selector: 'gf-produit-item',
  templateUrl: './produit-item.component.html',
  styleUrls: ['./produit-item.component.scss']
})
export class ProduitItemComponent implements OnInit {

  public readonly icons = Icons.produits;

  @Input() public produit: IProduit;
  @Input() public formulesChoisies: Formule[];
  @Output() public selectProduit: IProduit;
  @Output() public produitSelected: EventEmitter<any> = new EventEmitter<any>();

  constructor() { }

  ngOnInit(): void {
  }

  ajouterProduitPanier(item:IProduit) : void{
    // if (!this.formulesChoisies || this.formulesChoisies.length == 0) {
    //   alert("Veuillez choisir une formule avant d'ajouter un produit.")
    // } else {
      this.produitSelected.emit(item);
    // }
  }

}
