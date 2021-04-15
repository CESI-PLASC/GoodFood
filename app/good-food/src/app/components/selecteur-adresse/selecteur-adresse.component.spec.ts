import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { SelecteurAdresseComponent } from './selecteur-adresse.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { InfoAdresseComponent } from '../info-adresse/info-adresse.component';

describe('Selecteur adresse component tests', () => {
  let spectator: Spectator<SelecteurAdresseComponent>;
  let comp: SelecteurAdresseComponent;
  const createComponent = createComponentFactory({
    component: SelecteurAdresseComponent,
    imports: [
        FontAwesomeTestingModule
    ],
    entryComponents: [
        InfoAdresseComponent
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
