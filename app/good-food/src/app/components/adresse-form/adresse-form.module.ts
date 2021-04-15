import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdresseFormComponent } from './adresse-form.component';
import { AdresseModalComponent } from './modal/adresse-modal.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
      AdresseFormComponent,
      AdresseModalComponent,
  ],
  imports: [
      CommonModule,
      FontAwesomeModule,
      FormsModule,
      ReactiveFormsModule,
  ],
  exports: [
      AdresseFormComponent,
      AdresseModalComponent,
  ]
})
export class AdresseFormModule { }
