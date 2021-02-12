import { Input } from '@angular/core';
import { Component } from '@angular/core';
import { IFranchise } from 'src/app/shared/models/franchise';

@Component({
  selector: 'gf-info-franchise',
  templateUrl: './info-franchise.component.html',
  styleUrls: ['./info-franchise.component.scss']
})
export class InfoFranchiseComponent {
  @Input() public franchise: IFranchise;
}
