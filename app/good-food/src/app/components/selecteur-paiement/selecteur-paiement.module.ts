import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SelecteurPaiementComponent } from './selecteur-paiement.component';
import { SelecteurPaiementListModalComponent } from './modal/selecteur-paiement-list-modal.component';



@NgModule({
  declarations: [
      SelecteurPaiementComponent,
      SelecteurPaiementListModalComponent,
  ],
  imports: [
    CommonModule
  ],
  exports: [
      SelecteurPaiementComponent,
      SelecteurPaiementListModalComponent,
  ]
})
export class SelecteurPaiementModule { }
