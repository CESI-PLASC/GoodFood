import { CommandePageComponent } from './commande-page.component';
import { createComponentFactory, Spectator } from '@ngneat/spectator/jest';
import { CatalogueModule } from '../../components/catalogue/catalogue.module';
import { PanierModule } from '../../components/panier/panier.module';
import { ActivatedRoute } from '@angular/router';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { of } from 'rxjs';

describe('Commande page tests', () => {
  let spectator: Spectator<CommandePageComponent>;
  const createComponent = createComponentFactory({
    component: CommandePageComponent,
    imports: [
        CatalogueModule,
        PanierModule,
        HttpClientTestingModule,
        RouterTestingModule,
    ],
    providers: [{
      provide: ActivatedRoute,
      useValue: {
        params: of({idCommande: null})
      }
    }],
  });

  beforeEach(() => spectator = createComponent());

  it('Should create component', () => expect(spectator.component).toBeDefined());
});
