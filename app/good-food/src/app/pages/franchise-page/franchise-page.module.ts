import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FranchisePageComponent } from './franchise-page.component';
import { FranchiseModule } from '../../components/franchise/franchise.module';



@NgModule({
  declarations: [FranchisePageComponent],
  imports: [
    CommonModule,

      FranchiseModule,
  ],
  exports: [FranchisePageComponent]
})
export class FranchisePageModule { }
