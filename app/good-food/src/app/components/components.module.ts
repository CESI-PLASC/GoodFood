import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { ProduitItemComponent } from './produit-item/produit-item.component';
import { ProduitListComponent } from './produit-list/produit-list.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { CatalogueFiltreComponent } from './catalogue-filtre/catalogue-filtre.component';
import { MultiSelectModule } from 'primeng/multiselect';
import { FormsModule } from '@angular/forms';
import { SelectBoxComponent } from './select-box/select-box.component';
import { NgbAccordionModule, NgbCollapseModule, NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';
import { PanierComponent } from './panier/panier.component';

@NgModule({
  declarations: [CatalogueComponent, ProduitItemComponent, ProduitListComponent, CatalogueFiltreComponent, SelectBoxComponent, PanierComponent],
    imports: [
        CommonModule, FontAwesomeModule, MultiSelectModule, FormsModule, NgbDropdownModule, NgbCollapseModule, NgbAccordionModule
    ],
  exports: [
      CatalogueComponent,
      PanierComponent
  ]
})
export class ComponentsModule { }