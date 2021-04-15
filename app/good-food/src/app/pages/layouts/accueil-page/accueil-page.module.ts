import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AccueilPageComponent } from './accueil-page.component';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
      AccueilPageComponent
  ],
  imports: [
      CommonModule,
      NgbCarouselModule
  ],
  exports: [
      AccueilPageComponent
  ]
})
export class AccueilPageModule { }
