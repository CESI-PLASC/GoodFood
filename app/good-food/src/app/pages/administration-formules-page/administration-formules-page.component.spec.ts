import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AdministrationFormulesPageComponent } from './administration-formules-page.component';
import { AdministrationFormulesComponent } from 'src/app/components/administration/administration-formules/administration-formules.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { AjouterFormuleModule } from '../../components/ajouter-formule/ajouter-formule.module';

describe('Administration formules page tests', () => {
  let spectator: Spectator<AdministrationFormulesPageComponent>;
  let comp: AdministrationFormulesPageComponent;
  const createComponent = createComponentFactory({
    component: AdministrationFormulesPageComponent,
    imports: [
        FontAwesomeTestingModule,
        RouterTestingModule,
        HttpClientTestingModule,
        AjouterFormuleModule,
    ],
    entryComponents: [
      AdministrationFormulesComponent
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
