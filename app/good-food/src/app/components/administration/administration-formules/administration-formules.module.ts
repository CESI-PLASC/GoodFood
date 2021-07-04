import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdministrationFormulesComponent } from './administration-formules.component';
import { CatalogueModule } from '../../catalogue/catalogue.module';
import { AjouterFormuleModule } from '../../ajouter-formule/ajouter-formule.module';



@NgModule({
  declarations: [AdministrationFormulesComponent],
    imports: [
        CommonModule,
        CatalogueModule,
        AjouterFormuleModule
    ],
  exports: [AdministrationFormulesComponent]
})
export class AdministrationFormulesModule { }
