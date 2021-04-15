import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CoordonneeClientPageComponent } from './coordonnee-client-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminModule } from '../../components/admin/admin.module';



@NgModule({
  declarations: [CoordonneeClientPageComponent],
  imports: [
    CommonModule,
      FormsModule,
      ReactiveFormsModule,

      AdminModule,
  ],
  exports: [CoordonneeClientPageComponent]
})
export class CoordonneeClientPageModule { }
