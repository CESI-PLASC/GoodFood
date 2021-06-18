import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdministrationComponent } from './administration.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [AdministrationComponent],
  imports: [
    CommonModule,
      FontAwesomeModule,
      RouterModule,
  ],
  exports: [AdministrationComponent]
})
export class AdministrationModule { }
