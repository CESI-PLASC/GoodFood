import { Component, OnInit, OnChanges, SimpleChanges, Input } from '@angular/core';
import { Formule, IFormule } from 'src/app/shared/models/formule';
import { IProduit } from 'src/app/shared/models/produit';
import { Franchise, IFranchise } from '../../shared/models/franchise';

@Component({
  selector: 'gf-catalogue-page',
  templateUrl: './catalogue-page.component.html',
  styleUrls: ['./catalogue-page.component.scss']
})
export class CataloguePageComponent implements OnInit{

  public franchise: IFranchise;
  produitSelected : IProduit;
  @Input() public produitChoisi: IProduit;

  constructor() { }

  ngOnInit(): void {
    this.franchise = new Franchise({
      id: 777,
      name: 'Spicy miam noodles'
    });
  }
}
