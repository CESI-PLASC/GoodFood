import { Component } from '@angular/core';
import { IFranchise } from '../../shared/models/franchise';

@Component({
  selector: 'gf-catalogue-page',
  templateUrl: './catalogue-page.component.html',
  styleUrls: ['./catalogue-page.component.scss']
})
export class CataloguePageComponent {
  public franchise: IFranchise;
}
