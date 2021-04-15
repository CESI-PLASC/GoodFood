import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginFormComponent } from './login-form/login-form.component';
import { LoginModalComponent } from './login-form/modal/login-modal.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
      LoginFormComponent,
      LoginModalComponent,
  ],
  imports: [
    CommonModule,
      FontAwesomeModule,
      FormsModule,
      ReactiveFormsModule,
  ],
  exports: [
      LoginFormComponent,
      LoginModalComponent,
  ]
})
export class AdminModule { }
