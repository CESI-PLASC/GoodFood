import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AdministrationFormulesComponent } from './administration-formules.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { AjouterFormuleModule } from '../../ajouter-formule/ajouter-formule.module';
import { AjouterFormuleComponent } from '../../ajouter-formule/ajouter-formule.component';

describe('Administration produits page tests', () => {
  let spectator: Spectator<AdministrationFormulesComponent>;
  let comp: AdministrationFormulesComponent;
  const createComponent = createComponentFactory({
    component: AdministrationFormulesComponent,
    imports: [
        FontAwesomeTestingModule,
        RouterTestingModule,
        HttpClientTestingModule,
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
