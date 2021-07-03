import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AdministrationPageComponent } from './administration-page.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { AdministrationModule } from '../../components/administration/accueil/administration.module';

describe('Administration page tests', () => {
  let spectator: Spectator<AdministrationPageComponent>;
  let comp: AdministrationPageComponent;
  const createComponent = createComponentFactory({
    component: AdministrationPageComponent,
    imports: [
        FontAwesomeTestingModule,
        RouterTestingModule,
        HttpClientTestingModule,
        AdministrationModule,
    ],
  });

  beforeEach(() => {
    spectator = createComponent();
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });
});
