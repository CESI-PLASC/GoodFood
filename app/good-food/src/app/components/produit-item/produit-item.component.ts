import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { IProduit } from '../../shared/models/produit';
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
  @Output() public itemSelected: EventEmitter<any> = new EventEmitter<any>();
  produitsChoisis : IProduit[] = [];

  constructor() { }

  ngOnInit(): void {
  }

  ajouterProduitPanier(item:IProduit) : void{
    if (this.formulesChoisies.length == 0) {
      alert("Veuillez choisir une formule d'abord.")
    } else {
      this.produitsChoisis.push(item);
      this.itemSelected.emit(this.produitsChoisis);
    }
  }

}
