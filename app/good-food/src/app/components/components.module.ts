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
import { ListeFranchiseComponent } from './liste-franchise/liste-franchise.component';
import { InfoFranchiseComponent } from './info-franchise/info-franchise.component';
import { FiltreFranchiseComponent } from './filtre-franchise/filtre-franchise.component';
import { SelecteurAdresseComponent } from './selecteur-adresse/selecteur-adresse.component';
import { InfoAdresseComponent } from './info-adresse/info-adresse.component';
import { PaiementCarteComponent } from './paiement-carte/paiement-carte.component';

@NgModule({
  declarations: [
      CatalogueComponent,
      ProduitItemComponent,
      ProduitListComponent,
      CatalogueFiltreComponent,
      ListeFranchiseComponent,
      InfoFranchiseComponent,
      FiltreFranchiseComponent,
      PanierComponent,
      SelectBoxComponent,
      SelecteurAdresseComponent,
      InfoAdresseComponent,
      PaiementCarteComponent
  ],
    imports: [
        CommonModule,
        FontAwesomeModule,
        MultiSelectModule,
        FormsModule,
        NgbDropdownModule,
        NgbCollapseModule,
        NgbAccordionModule
    ],
  exports: [
      CatalogueComponent,
      ProduitItemComponent,
      ProduitListComponent,
      CatalogueFiltreComponent,
      ListeFranchiseComponent,
      InfoFranchiseComponent,
      FiltreFranchiseComponent,
      PanierComponent,
      SelectBoxComponent,
      SelecteurAdresseComponent,
      PaiementCarteComponent
  ]
})
export class ComponentsModule { }
