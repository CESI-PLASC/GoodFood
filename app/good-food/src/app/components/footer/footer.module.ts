import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FooterComponent } from './footer.component';
import { RouterModule } from '@angular/router';
import { NgbCollapseModule } from '@ng-bootstrap/ng-bootstrap';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';



@NgModule({
  declarations: [FooterComponent],
  imports: [
    CommonModule,
    RouterModule,
    NgbCollapseModule,
    FontAwesomeModule
  ],
  exports: [FooterComponent]
})
export class FooterModule { }
