import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InfoPaiementComponent } from './info-paiement.component';



@NgModule({
  declarations: [
      InfoPaiementComponent,
  ],
  imports: [
      CommonModule
  ],
  exports: [
      InfoPaiementComponent,
  ]
})
export class InfoPaiementModule { }
