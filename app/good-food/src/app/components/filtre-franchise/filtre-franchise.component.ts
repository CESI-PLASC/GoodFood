import { Component, OnInit } from '@angular/core';
import { Icons } from 'src/app/shared/constants/icons.constant';

@Component({
  selector: 'gf-filtre-franchise',
  templateUrl: './filtre-franchise.component.html',
  styleUrls: ['./filtre-franchise.component.scss']
})
export class FiltreFranchiseComponent {
  public loupe = Icons.franchise.loupe;
}
