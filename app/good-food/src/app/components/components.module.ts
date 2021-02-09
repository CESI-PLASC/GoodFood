import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { ProduitItemComponent } from './produit-item/produit-item.component';
import { ProduitListComponent } from './produit-list/produit-list.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { CatalogueFiltreComponent } from './catalogue-filtre/catalogue-filtre.component';
import { MultiSelectModule } from 'primeng/multiselect';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [CatalogueComponent, ProduitItemComponent, ProduitListComponent, CatalogueFiltreComponent],
    imports: [
        CommonModule, FontAwesomeModule, MultiSelectModule, FormsModule
    ],
  exports: [
      CatalogueComponent
  ]
})
export class ComponentsModule { }
