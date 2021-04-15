import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { ProduitListComponent } from './produit-list.component';
import { ProduitItemComponent } from '../produit-item/produit-item.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

describe('Produit list component tests', () => {
  let spectator: Spectator<ProduitListComponent>;
  let comp: ProduitListComponent;
  const createComponent = createComponentFactory({
    component: ProduitListComponent,
    imports: [
      FontAwesomeTestingModule
    ],
    entryComponents: [
        ProduitItemComponent
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
