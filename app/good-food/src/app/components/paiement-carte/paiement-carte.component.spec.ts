import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { PaiementCarteComponent } from './paiement-carte.component';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Paiement carte component tests', () => {
  let spectator: Spectator<PaiementCarteComponent>;
  let comp: PaiementCarteComponent;
  const createComponent = createComponentFactory({
    component: PaiementCarteComponent,
    imports: [

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
