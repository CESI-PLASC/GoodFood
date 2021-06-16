import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { SelecteurAdresseListModalComponent } from './selecteur-adresse-list-modal.component';
import { InfoAdresseComponent } from '../../info-adresse/info-adresse.component';
import { AdresseFormComponent } from '../../adresse-form/adresse-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

describe('Selecteur adresse component tests', () => {
  let spectator: Spectator<SelecteurAdresseListModalComponent>;
  let comp: SelecteurAdresseListModalComponent;
  const createComponent = createComponentFactory({
    component: SelecteurAdresseListModalComponent,
    imports: [
      FontAwesomeTestingModule,
        FormsModule,
        ReactiveFormsModule
    ],
    providers: [
      NgbActiveModal
    ],
    entryComponents: [
        InfoAdresseComponent,
        AdresseFormComponent
    ]
  });

  beforeEach(() => {
    spectator = createComponent({
      props: {
        localisations: []
      }
    });
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });
});
