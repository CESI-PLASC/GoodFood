import { InfoPaiementComponent } from './info-paiement.component';
import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

describe('InfoPaiementComponent', () => {
  let spectator: Spectator<InfoPaiementComponent>;
  const createComponent = createComponentFactory({
    component: InfoPaiementComponent,
    imports: [
    ]
  });

  let comp: InfoPaiementComponent;

  beforeEach(() => {
    spectator = createComponent();
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });
});
