import { Component, Input, OnInit, Output } from '@angular/core';
import { Franchise } from '../../shared/models/franchise';
import { Categorie, ICategorie } from '../../shared/models/categorie';
import { IProduit, ISimpleProduit, Produit, SimpleProduit } from '../../shared/models/produit';
import { Icons } from '../../shared/constants/icons.constant';
import { Formule } from 'src/app/shared/models/formule';

interface ICollapsedItem {
  id: number;
  isCollapsed: boolean;
}

@Component({
  selector: 'gf-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.scss']
})
export class CatalogueComponent implements OnInit {

  @Input() public franchise: Franchise;
  produitSelected : IProduit;
  formulesChoisies : Formule[];

  public categories: ICategorie[] = [];
  public collapsedList: boolean[] = [];
  public icons = Icons.catalogue;

  constructor() { }

  ngOnInit(): void {
    this.categories = [
      new Categorie({
        id: 1,
        designation: 'Plats',
        produits: [
          new SimpleProduit({
            id: 1,
            designation: 'Scipy ramen',
            prix: 10.9
          }),
          new SimpleProduit({
            id: 2,
            designation: 'Scipy noodles',
            prix: 9
          })
        ]
      }),
      new Categorie({
        id: 2,
        designation: 'Desserts',
        produits: [
          new SimpleProduit({
            id: 1,
            designation: 'NO spicy cream',
            prix: 3.5
          }),
          new SimpleProduit({
            id: 2,
            designation: 'Spicy ice cream',
            prix: 5.2
          })
        ]
      })
    ];

    this.categories.forEach(() => this.collapsedList.push(true));
  }

  public onFilterChange(filters: any): void {
    console.log('filtre change');
    console.log(filters);
  }

}
