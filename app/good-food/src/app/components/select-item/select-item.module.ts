import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SelectItemComponent } from './select-item.component';
import { NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';



@NgModule({
  declarations: [SelectItemComponent],
  imports: [
    CommonModule,
      NgbDropdownModule
  ],
  exports: [SelectItemComponent]
})
export class SelectItemModule { }
