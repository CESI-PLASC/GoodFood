import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdministrationPageComponent } from './administration-page.component';
import { AdministrationModule } from '../../components/administration/accueil/administration.module';



@NgModule({
  declarations: [AdministrationPageComponent],
  imports: [
    CommonModule,

      AdministrationModule,
  ],
  exports: [AdministrationPageComponent]
})
export class AdministrationPageModule { }
