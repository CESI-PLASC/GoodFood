import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SelectBoxComponent } from './select-box.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';



@NgModule({
  declarations: [SelectBoxComponent],
  imports: [
    CommonModule,
      FontAwesomeModule,
      NgbDropdownModule
  ],
  exports: [SelectBoxComponent]
})
export class SelectBoxModule { }
