import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { ProduitItemComponent } from './produit-item/produit-item.component';
import { ProduitListComponent } from './produit-list/produit-list.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { CatalogueFiltreComponent } from './catalogue-filtre/catalogue-filtre.component';
import { MultiSelectModule } from 'primeng/multiselect';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SelectBoxComponent } from './select-box/select-box.component';
import { NgbAccordionModule, NgbCarouselModule, NgbCollapseModule, NgbDropdownModule, NgbNavbar, NgbNavModule } from '@ng-bootstrap/ng-bootstrap';
import { PanierComponent } from './panier/panier.component';
import { ListeFranchiseComponent } from './liste-franchise/liste-franchise.component';
import { InfoFranchiseComponent } from './info-franchise/info-franchise.component';
import { FiltreFranchiseComponent } from './filtre-franchise/filtre-franchise.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AccueilComponent } from './accueil/accueil.component';
import { RouterModule } from '@angular/router';
import { SelecteurAdresseComponent } from './selecteur-adresse/selecteur-adresse.component';
import { InfoAdresseComponent } from './info-adresse/info-adresse.component';
import { PaiementCarteComponent } from './paiement-carte/paiement-carte.component';
import { AdresseFormComponent } from './adresse-box/adresse-form.component';
import { AdresseModalComponent } from './adresse-box/modal/adresse-modal.component';
import { SelecteurAdresseListModalComponent } from './selecteur-adresse/modal/selecteur-adresse-list-modal.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { LoginModalComponent } from './login-form/modal/login-modal.component';
import { SelecteurPaiementComponent } from './selecteur-paiement/selecteur-paiement.component';
import { InfoPaiementComponent } from './info-paiement/info-paiement.component';
import { SelecteurPaiementListModalComponent } from './selecteur-paiement/modal/selecteur-paiement-list-modal.component';

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
      AccueilComponent,
      SelecteurAdresseComponent,
      InfoAdresseComponent,
      PaiementCarteComponent,
      AdresseFormComponent,
      AdresseModalComponent,
      SelecteurAdresseListModalComponent,
      LoginFormComponent,
      LoginModalComponent,
      SelecteurPaiementComponent,
      InfoPaiementComponent,
      SelecteurPaiementListModalComponent
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
        RouterModule,
        NgbCarouselModule,
        ReactiveFormsModule
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
        PaiementCarteComponent,
        AdresseFormComponent,
        LoginFormComponent,
        SelecteurPaiementComponent,
        InfoPaiementComponent
    ]
})
export class ComponentsModule { }
