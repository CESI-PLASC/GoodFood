import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormuleListComponent } from './formule-list.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { SelectItemModule } from '../select-item/select-item.module';
import { NgbCollapseModule } from '@ng-bootstrap/ng-bootstrap';



@NgModule({
  declarations: [
      FormuleListComponent
  ],
  imports: [
    CommonModule,
      FontAwesomeModule,
      NgbCollapseModule,

      SelectItemModule
  ],
  exports: [
      FormuleListComponent
  ]
})
export class FormuleListModule { }
