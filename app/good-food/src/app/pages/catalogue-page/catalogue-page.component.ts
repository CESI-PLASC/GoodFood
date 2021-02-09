import { Component, OnInit } from '@angular/core';
import { Franchise, IFranchise } from '../../shared/models/franchise';

@Component({
  selector: 'gf-catalogue-page',
  templateUrl: './catalogue-page.component.html',
  styleUrls: ['./catalogue-page.component.scss']
})
export class CataloguePageComponent implements OnInit {

  public franchise: IFranchise;

  constructor() { }

  ngOnInit(): void {
    this.franchise = new Franchise({
      id: 777,
      name: 'Spicy miam noodles'
    });
  }

}
