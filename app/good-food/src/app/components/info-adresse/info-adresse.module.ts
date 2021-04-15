import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InfoAdresseComponent } from './info-adresse.component';



@NgModule({
  declarations: [
      InfoAdresseComponent,
  ],
  imports: [
    CommonModule
  ],
  exports: [
      InfoAdresseComponent,
  ]
})
export class InfoAdresseModule { }
