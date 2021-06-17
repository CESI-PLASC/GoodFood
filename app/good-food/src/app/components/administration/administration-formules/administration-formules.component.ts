import { Component, OnInit } from '@angular/core';
import { CatalogueService } from 'src/app/pages/catalogue-page/services/catalogue.service';
import { Formule } from 'src/app/shared/models/formule/formule';

@Component({
  selector: 'gf-administration-formules',
  templateUrl: './administration-formules.component.html',
  styleUrls: ['./administration-formules.component.scss']
})
export class AdministrationFormulesComponent implements OnInit{
  public formules: Formule[];

  constructor(private readonly catalogueService: CatalogueService) { }

  ngOnInit(): void {
    this.catalogueService.getFormules().subscribe(result => this.formules = result);
  }
}
