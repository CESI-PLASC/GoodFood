import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdministrationFormulesPageComponent } from './administration-formules-page.component';
import { AdministrationFormulesModule } from 'src/app/components/administration/administration-formules/administration-formules.module';



@NgModule({
  declarations: [
    AdministrationFormulesPageComponent
  ],
  imports: [
    CommonModule,

    AdministrationFormulesModule,

  ],
  exports: [
    AdministrationFormulesPageComponent]
})
export class AdministrationFormulesPageModule { }
