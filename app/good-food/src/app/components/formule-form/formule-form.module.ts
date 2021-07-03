import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormuleFormComponent } from './formule-form.component';
import { FormuleModalComponent } from './modal/formule-modal.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
      FormuleFormComponent,
      FormuleModalComponent,
  ],
  imports: [
      CommonModule,
      FontAwesomeModule,
      FormsModule,
      ReactiveFormsModule,
  ],
  exports: [
    FormuleFormComponent,
      FormuleModalComponent,
  ]
})
export class FormuleFormModule { }
