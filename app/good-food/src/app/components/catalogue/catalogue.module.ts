import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CatalogueComponent } from './catalogue.component';
import { CatalogueFiltreComponent } from './catalogue-filtre/catalogue-filtre.component';
import { NgbCollapseModule } from '@ng-bootstrap/ng-bootstrap';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { SelectBoxModule } from '../select-box/select-box.module';
import { ProduitModule } from '../produit/produit.module';



@NgModule({
  declarations: [
      CatalogueComponent,
      CatalogueFiltreComponent,
  ],
  imports: [
      CommonModule,
      NgbCollapseModule,
      FontAwesomeModule,

      SelectBoxModule,
      ProduitModule,
  ],
  exports: [
      CatalogueComponent,
      CatalogueFiltreComponent,
  ]
})
export class CatalogueModule { }
