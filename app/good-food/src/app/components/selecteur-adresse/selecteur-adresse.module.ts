import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SelecteurAdresseComponent } from './selecteur-adresse.component';
import { SelecteurAdresseListModalComponent } from './modal/selecteur-adresse-list-modal.component';
import { AdresseFormModule } from '../adresse-form/adresse-form.module';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { InfoAdresseModule } from '../info-adresse/info-adresse.module';



@NgModule({
  declarations: [
      SelecteurAdresseComponent,
      SelecteurAdresseListModalComponent,
  ],
  imports: [
      CommonModule,
      FontAwesomeModule,

      AdresseFormModule,
      InfoAdresseModule,
  ],
  exports: [
    SelecteurAdresseComponent,
    SelecteurAdresseListModalComponent,
  ]
})
export class SelecteurAdresseModule { }
