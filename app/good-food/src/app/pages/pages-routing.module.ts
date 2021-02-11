import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { CataloguePageComponent } from './catalogue-page/catalogue-page.component';
import { FranchisePageComponent } from './franchise-page/franchise-page.component';

const routes: Routes = [
  {
    path: 'catalogue/:id',
    component: CataloguePageComponent
  },
  {
    path: 'franchise',
    component: FranchisePageComponent
  }
];

@NgModule({
  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class PagesRoutingModule { }
