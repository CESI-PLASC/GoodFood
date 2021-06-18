import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdministrationProduitsComponent } from './administration-produits.component';
import { CatalogueModule } from '../../catalogue/catalogue.module';



@NgModule({
  declarations: [AdministrationProduitsComponent],
    imports: [
        CommonModule,
        CatalogueModule
    ],
  exports: [AdministrationProduitsComponent]
})
export class AdministrationProduitsModule { }
