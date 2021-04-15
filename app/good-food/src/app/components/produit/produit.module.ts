import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProduitListComponent } from './produit-list/produit-list.component';
import { ProduitItemComponent } from './produit-item/produit-item.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';



@NgModule({
  declarations: [
      ProduitListComponent,
      ProduitItemComponent,
  ],
  imports: [
    CommonModule,
      FontAwesomeModule
  ],
  exports: [
      ProduitListComponent,
      ProduitItemComponent,
  ]
})
export class ProduitModule { }
