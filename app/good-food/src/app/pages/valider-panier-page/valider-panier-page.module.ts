import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ValiderPanierPageComponent } from './valider-panier-page.component';
import { PanierModule } from '../../components/panier/panier.module';
import { FranchiseModule } from '../../components/franchise/franchise.module';
import { SelecteurAdresseModule } from '../../components/selecteur-adresse/selecteur-adresse.module';
import { PaiementCarteModule } from '../../components/paiement-carte/paiement-carte.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { SelecteurPaiementModule } from '../../components/selecteur-paiement/selecteur-paiement.module';



@NgModule({
  declarations: [ValiderPanierPageComponent],
    imports: [
        CommonModule,
        FormsModule,
        ReactiveFormsModule,
        RouterModule,

        PanierModule,
        FranchiseModule,
        SelecteurAdresseModule,
        PaiementCarteModule,
        SelecteurPaiementModule,
    ],
  exports: [ValiderPanierPageComponent]
})
export class ValiderPanierPageModule { }
