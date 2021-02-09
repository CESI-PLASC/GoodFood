import { Component, Input, OnInit } from '@angular/core';
import { ISimpleProduit } from '../../shared/models/produit';

@Component({
  selector: 'gf-produit-list',
  templateUrl: './produit-list.component.html',
  styleUrls: ['./produit-list.component.scss']
})
export class ProduitListComponent implements OnInit {

  @Input() public produits: ISimpleProduit[];

  constructor() { }

  ngOnInit(): void {
  }

}
