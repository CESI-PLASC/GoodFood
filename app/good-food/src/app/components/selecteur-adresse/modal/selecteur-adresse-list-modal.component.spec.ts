import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { SelecteurAdresseListModalComponent } from './selecteur-adresse-list-modal.component';
import { InfoAdresseComponent } from '../../info-adresse/info-adresse.component';
import { AdresseFormComponent } from '../../adresse-form/adresse-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Selecteur adresse component tests', () => {
  let spectator: Spectator<SelecteurAdresseListModalComponent>;
  let comp: SelecteurAdresseListModalComponent;
  const createComponent = createComponentFactory({
    component: SelecteurAdresseListModalComponent,
    imports: [
      FontAwesomeTestingModule,
        FormsModule,
        ReactiveFormsModule
    ],
    entryComponents: [
        InfoAdresseComponent,
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
