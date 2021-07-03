import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AdministrationProduitsPageComponent } from './administration-produits-page.component';
import { AdministrationProduitsComponent } from 'src/app/components/administration/administration-produits/administration-produits.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { CatalogueModule } from '../../components/catalogue/catalogue.module';

describe('Administration produits page tests', () => {
  let spectator: Spectator<AdministrationProduitsPageComponent>;
  let comp: AdministrationProduitsPageComponent;
  const createComponent = createComponentFactory({
    component: AdministrationProduitsPageComponent,
    imports: [
        FontAwesomeTestingModule,
        RouterTestingModule,
        HttpClientTestingModule,
        CatalogueModule,
    ],
    entryComponents: [
      AdministrationProduitsComponent
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
