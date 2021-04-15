import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PaiementCarteComponent } from './paiement-carte.component';



@NgModule({
  declarations: [PaiementCarteComponent],
  imports: [
    CommonModule
  ],
  exports: [PaiementCarteComponent]
})
export class PaiementCarteModule { }
