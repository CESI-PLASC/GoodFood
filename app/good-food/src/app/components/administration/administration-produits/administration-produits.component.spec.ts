import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AdministrationProduitsComponent } from './administration-produits.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { CatalogueModule } from '../../catalogue/catalogue.module';
import { AjouterFormuleModule } from '../../ajouter-formule/ajouter-formule.module';
import { AjouterFormuleComponent } from '../../ajouter-formule/ajouter-formule.component';

describe('Administration produits page tests', () => {
  let spectator: Spectator<AdministrationProduitsComponent>;
  let comp: AdministrationProduitsComponent;
  const createComponent = createComponentFactory({
    component: AdministrationProduitsComponent,
    imports: [
        FontAwesomeTestingModule,
        RouterTestingModule,
        HttpClientTestingModule,
        CatalogueModule,
        AjouterFormuleModule,
    ],
    entryComponents: [
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
