import { Component, Input, EventEmitter, Output, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import {
  ISimpleProduit,
  Produit,
} from '../../../shared/models/produit/produit';

@Component({
  selector: 'gf-produit-list',
  templateUrl: './produit-list.component.html',
  styleUrls: ['./produit-list.component.scss'],
})
export class ProduitListComponent implements OnInit {
  @Input() public produits: ISimpleProduit[];
  produit: ISimpleProduit;

  public isAdministration = false;

  // Gestion du produit sélectionné
  @Output() public produitSelected = new EventEmitter<Produit>();

  constructor(private readonly activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    this.isAdministration =
      this.activatedRoute.snapshot?.data?.isAdministration;
  }
}
