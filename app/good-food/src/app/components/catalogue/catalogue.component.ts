import { Component, Input, OnInit } from '@angular/core';
import { Franchise } from '../../shared/models/franchise';
import { ICategorie } from '../../shared/models/categorie';
import { Icons } from '../../shared/constants/icons.constant';
import { CatalogueService } from '../../pages/catalogue-page/services/catalogue.service';

@Component({
  selector: 'gf-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.scss']
})
export class CatalogueComponent implements OnInit {

  @Input() public franchise: Franchise;

  public categories: ICategorie[] = [];
  public collapsedList: boolean[] = [];
  public icons = Icons.catalogue;

  constructor(private readonly catalogueService: CatalogueService) { }

  ngOnInit(): void {
    this.collapsedList = [];
    this.catalogueService.getByFranchiseId(this.franchise.id).subscribe(res => {
      this.categories = res;
    });
  }

  public onFilterChange(filters: any): void {
    console.log('filtre change');
    console.log(filters);
  }

}
