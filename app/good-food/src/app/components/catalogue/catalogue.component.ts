import { Component, Input, OnInit } from '@angular/core';
import { Franchise } from '../../shared/models/franchise/franchise';
import { ICategorie } from '../../shared/models/categorie/categorie';
import { IProduit } from '../../shared/models/produit/produit';
import { Icons } from '../../shared/constants/icons.constant';
import { CatalogueService } from '../../pages/catalogue-page/services/catalogue.service';
import { Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { ActivatedRoute } from '@angular/router';


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
  @Output() public produitSelected: EventEmitter<any> = new EventEmitter<any>();

  public isAdministration = false;

  constructor(private readonly catalogueService: CatalogueService, private readonly activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.collapsedList = [];
    this.catalogueService.getByFranchiseId(this.franchise.id).subscribe(res => {
      this.categories = res;
    });
    this.isAdministration = this.activatedRoute.snapshot?.data?.isAdministration;
  }

  public onFilterChange(filters: any): void {
    console.log('filtre change');
    console.log(filters);
  }

  public recupProduit(item: IProduit): void{
    this.produitSelected.emit(item);
  }
}
