import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AjouterFormuleComponent } from './ajouter-formule.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { InfoAdresseComponent } from '../info-adresse/info-adresse.component';

describe('Ajouter formule component tests', () => {
  let spectator: Spectator<AjouterFormuleComponent>;
  let comp: AjouterFormuleComponent;
  const createComponent = createComponentFactory({
    component: AjouterFormuleComponent,
    imports: [
        FontAwesomeTestingModule
    ],
    entryComponents: [
        InfoAdresseComponent
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
