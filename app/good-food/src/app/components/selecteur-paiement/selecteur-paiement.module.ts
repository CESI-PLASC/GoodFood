import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SelecteurPaiementComponent } from './selecteur-paiement.component';
import { SelecteurPaiementListModalComponent } from './modal/selecteur-paiement-list-modal.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { MethodePaiementFormModule } from '../methode-paiement-form/methode-paiement-form.module';
import {InfoPaiementModule} from "../info-paiement/info-paiement.module";


@NgModule({
  declarations: [
      SelecteurPaiementComponent,
      SelecteurPaiementListModalComponent,
  ],
  imports: [
      CommonModule,
      FontAwesomeModule,

      MethodePaiementFormModule,
      InfoPaiementModule
  ],
  exports: [
      SelecteurPaiementComponent,
      SelecteurPaiementListModalComponent,
  ]
})
export class SelecteurPaiementModule { }
