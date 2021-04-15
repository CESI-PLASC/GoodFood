import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { ProduitItemComponent } from './produit-item.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

describe('Produit item component tests', () => {
  let spectator: Spectator<ProduitItemComponent>;
  let comp: ProduitItemComponent;
  const createComponent = createComponentFactory({
    component: ProduitItemComponent,
    imports: [
      FontAwesomeTestingModule
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
