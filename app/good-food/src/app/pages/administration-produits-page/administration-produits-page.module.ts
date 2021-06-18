import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdministrationProduitsPageComponent } from './administration-produits-page.component';
import { AdministrationProduitsModule } from 'src/app/components/administration/administration-produits/administration-produits.module';



@NgModule({
  declarations: [
    AdministrationProduitsPageComponent
  ],
  imports: [
    CommonModule,

    AdministrationProduitsModule,

  ],
  exports: [
    AdministrationProduitsPageComponent]
})
export class AdministrationProduitsPageModule { }
