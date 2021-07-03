import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PolitiqueComponent } from './politique.component';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    PolitiqueComponent
  ],
  imports: [
      CommonModule,
      NgbCarouselModule
  ],
  exports: [
    PolitiqueComponent
  ]
})
export class PolitiqueModule { }
