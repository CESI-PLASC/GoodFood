import { SelecteurPaiementComponent } from './selecteur-paiement.component';
import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { MockComponent } from 'ng-mocks';
import { InfoPaiementComponent } from '../info-paiement/info-paiement.component';

describe('SelecteurPaiementComponent', () => {
  let spectator: Spectator<SelecteurPaiementComponent>;
  const createComponent = createComponentFactory({
    component: SelecteurPaiementComponent,
    imports: [
        FontAwesomeTestingModule
    ],
    declarations: [
        MockComponent(InfoPaiementComponent)
    ]
  });


  let comp: SelecteurPaiementComponent;


  beforeEach(() => {
    spectator = createComponent();
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeTruthy();
  });
});
