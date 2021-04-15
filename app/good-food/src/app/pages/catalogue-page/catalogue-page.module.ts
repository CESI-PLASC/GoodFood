import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CataloguePageComponent } from './catalogue-page.component';
import { CatalogueModule } from '../../components/catalogue/catalogue.module';
import { PanierModule } from '../../components/panier/panier.module';



@NgModule({
  declarations: [
      CataloguePageComponent,
  ],
  imports: [
      CommonModule,

      CatalogueModule,
      PanierModule,
  ],
  exports: [
      CataloguePageComponent,
  ]
})
export class CataloguePageModule { }
