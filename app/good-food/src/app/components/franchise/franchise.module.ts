import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FiltreFranchiseComponent } from './filtre-franchise/filtre-franchise.component';
import { InfoFranchiseComponent } from './info-franchise/info-franchise.component';
import { ListeFranchiseComponent } from './liste-franchise/liste-franchise.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [
      FiltreFranchiseComponent,
      InfoFranchiseComponent,
      ListeFranchiseComponent,
  ],
    imports: [
        CommonModule,
        FontAwesomeModule,
        HttpClientModule,
        RouterModule
    ],
  exports: [
      FiltreFranchiseComponent,
      InfoFranchiseComponent,
      ListeFranchiseComponent,
  ]
})
export class FranchiseModule { }
