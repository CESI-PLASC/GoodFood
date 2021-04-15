import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MethodePaiementFormComponent } from './methode-paiement-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
      MethodePaiementFormComponent,
  ],
  imports: [
    CommonModule,
      FormsModule,
      ReactiveFormsModule
  ],
  exports: [
      MethodePaiementFormComponent,
  ]
})
export class MethodePaiementFormModule { }
