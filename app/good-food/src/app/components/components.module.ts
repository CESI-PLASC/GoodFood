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
import { NgbAccordionModule, NgbCollapseModule, NgbDropdownModule, NgbNavbar, NgbNavModule } from '@ng-bootstrap/ng-bootstrap';
import { PanierComponent } from './panier/panier.component';
import { ListeFranchiseComponent } from './liste-franchise/liste-franchise.component';
import { InfoFranchiseComponent } from './info-franchise/info-franchise.component';
import { FiltreFranchiseComponent } from './filtre-franchise/filtre-franchise.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AccueilComponent } from './accueil/accueil.component';
import { RouterModule } from '@angular/router';

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
      NavbarComponent,
      AccueilComponent
  ],
    imports: [
        CommonModule,
        FontAwesomeModule,
        MultiSelectModule,
        FormsModule,
        NgbDropdownModule,
        NgbCollapseModule,
        NgbAccordionModule,
        NgbNavModule,
        RouterModule
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
      SelectBoxComponent
  ]
})
export class ComponentsModule { }
