import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MethodePaiementFormComponent } from './methode-paiement-form.component';



@NgModule({
  declarations: [
      MethodePaiementFormComponent,
  ],
  imports: [
    CommonModule
  ],
  exports: [
      MethodePaiementFormComponent,
  ]
})
export class MethodePaiementFormModule { }
