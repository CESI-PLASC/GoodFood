import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AjouterFormuleComponent } from './ajouter-formule.component';
import { FormuleFormModule } from '../formule-form/formule-form.module';
import { AjouterFormuleModalComponent } from './modal/ajouter-formule-modal.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';



@NgModule({
  declarations: [
    AjouterFormuleComponent,
    AjouterFormuleModalComponent,
  ],
  imports: [
      CommonModule,
      FontAwesomeModule,

      FormuleFormModule,

  ],
  exports: [
    AjouterFormuleComponent,
    AjouterFormuleModalComponent,
  ]
})
export class AjouterFormuleModule { }
