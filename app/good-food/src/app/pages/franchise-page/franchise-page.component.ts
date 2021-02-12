import { Component } from '@angular/core';
import { IFranchise } from 'src/app/shared/models/franchise';

@Component({
  selector: 'gf-franchise-page',
  templateUrl: './franchise-page.component.html',
  styleUrls: ['./franchise-page.component.scss']
})
export class FranchisePageComponent {
  public franchise: IFranchise;
}
