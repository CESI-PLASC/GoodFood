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
import { NgbCollapseModule, NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';
import { FormuleListComponent } from './formule-list/formule-list.component';
import { SelectItemComponent } from './select-item/select-item.component';
import { PanierAjoutProduitComponent } from './panier-ajout-produit/panier-ajout-produit.component';



@NgModule({
  declarations: [CatalogueComponent, ProduitItemComponent, ProduitListComponent, CatalogueFiltreComponent, SelectBoxComponent, FormuleListComponent, SelectItemComponent, PanierAjoutProduitComponent],
    imports: [
        CommonModule, FontAwesomeModule, MultiSelectModule, FormsModule, NgbDropdownModule, NgbCollapseModule
    ],
  exports: [
      CatalogueComponent
  ]
})
export class ComponentsModule { }
