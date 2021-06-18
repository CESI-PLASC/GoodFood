import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdministrationFormulesComponent } from './administration-formules.component';
import { CatalogueModule } from '../../catalogue/catalogue.module';



@NgModule({
  declarations: [AdministrationFormulesComponent],
    imports: [
        CommonModule,
        CatalogueModule
    ],
  exports: [AdministrationFormulesComponent]
})
export class AdministrationFormulesModule { }
