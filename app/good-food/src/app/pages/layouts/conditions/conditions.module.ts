import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ConditionsComponent } from './conditions.component';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    ConditionsComponent
  ],
  imports: [
      CommonModule,
      NgbCarouselModule
  ],
  exports: [
    ConditionsComponent
  ]
})
export class ConditionsModule { }
