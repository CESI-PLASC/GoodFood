import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PanierComponent } from './panier.component';
import { PanierAjoutProduitComponent } from './panier-ajout-produit/panier-ajout-produit.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FormuleListModule } from '../formule-list/formule-list.module';
import { NgbAccordionModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [
      PanierComponent,
      PanierAjoutProduitComponent,
  ],
    imports: [
        CommonModule,
        FormsModule,
        ReactiveFormsModule,
        NgbAccordionModule,

        FormuleListModule,
        RouterModule,
    ],
  exports: [
      PanierComponent,
      PanierAjoutProduitComponent,
  ]
})
export class PanierModule { }
