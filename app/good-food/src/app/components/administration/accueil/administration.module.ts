import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdministrationComponent } from './administration.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';



@NgModule({
  declarations: [AdministrationComponent],
  imports: [
    CommonModule,
      FontAwesomeModule,
  ],
  exports: [AdministrationComponent]
})
export class AdministrationModule { }
