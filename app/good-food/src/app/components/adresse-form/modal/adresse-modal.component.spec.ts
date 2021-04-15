import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AdresseModalComponent } from './adresse-modal.component';
import { NgbActiveModal, NgbModalModule } from '@ng-bootstrap/ng-bootstrap';
import { AdresseFormComponent } from '../adresse-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

describe('Adresse modal tests', () => {
  let spectator: Spectator<AdresseModalComponent>;
  let comp: AdresseModalComponent;
  const createComponent = createComponentFactory({
    component: AdresseModalComponent,
    imports: [
        NgbModalModule,
        FormsModule,
        ReactiveFormsModule,
        FontAwesomeTestingModule
    ],
    providers: [
        NgbActiveModal,
    ],
    entryComponents: [
        AdresseFormComponent
    ]
  });

  beforeEach(() => {
    spectator = createComponent();
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });
});
