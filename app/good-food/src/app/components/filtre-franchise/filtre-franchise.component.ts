import { Component, OnInit } from '@angular/core';
import { faSearch } from '@fortawesome/free-solid-svg-icons';
import { Icons } from 'src/app/shared/constants/icons.constant';

@Component({
  selector: 'gf-filtre-franchise',
  templateUrl: './filtre-franchise.component.html',
  styleUrls: ['./filtre-franchise.component.scss']
})
export class FiltreFranchiseComponent implements OnInit {
  public loupe = Icons.franchise.loupe;
  constructor() { }

  ngOnInit(): void {
  }

}
