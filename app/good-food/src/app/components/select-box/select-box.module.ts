import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SelectBoxComponent } from './select-box.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';



@NgModule({
  declarations: [SelectBoxComponent],
  imports: [
    CommonModule,
      FontAwesomeModule
  ],
  exports: [SelectBoxComponent]
})
export class SelectBoxModule { }
