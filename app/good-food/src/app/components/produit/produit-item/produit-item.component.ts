import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
import { Icons } from '../../../shared/constants/icons.constant';
import { IProduit, Produit } from '../../../shared/models/produit/produit';
import { ActivatedRoute } from '@angular/router';

registerLocaleData(localeFr);

@Component({
  selector: 'gf-produit-item',
  templateUrl: './produit-item.component.html',
  styleUrls: ['./produit-item.component.scss'],
})
export class ProduitItemComponent implements OnInit {
  public readonly icons = Icons.produits;
  @Input() public produit: IProduit;
  public isAdministration = false;

  // Gestion du produit sélectionné
  @Output() produitSelected = new EventEmitter<Produit>();

  constructor(private readonly activatedRoute: ActivatedRoute) {}
  ngOnInit(): void {
    this.isAdministration =
      this.activatedRoute.snapshot?.data?.isAdministration;
  }
}
