import { Component } from '@angular/core';
import { Icons } from 'src/app/shared/constants/icons.constant';

@Component({
  selector: 'gf-administration',
  templateUrl: './administration.component.html',
  styleUrls: ['./administration.component.scss']
})
export class AdministrationComponent {
  public icons = Icons;
}
