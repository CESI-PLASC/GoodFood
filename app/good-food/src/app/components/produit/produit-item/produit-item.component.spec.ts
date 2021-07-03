import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { ProduitItemComponent } from './produit-item.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { ActivatedRoute } from '@angular/router';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { RouterTestingModule } from '@angular/router/testing';

describe('Produit item component tests', () => {
  let spectator: Spectator<ProduitItemComponent>;
  let comp: ProduitItemComponent;
  const createComponent = createComponentFactory({
    component: ProduitItemComponent,
    imports: [
      FontAwesomeTestingModule,
      HttpClientTestingModule,
      RouterTestingModule,
    ],
    providers: [{
      provide: ActivatedRoute,
      useValue: {
        snapshot: {data: {isAdministration: false}}
      }
    }],
  });

  beforeEach(() => {
    spectator = createComponent();
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });
});
