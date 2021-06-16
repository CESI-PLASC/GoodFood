import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AdministrationComponent } from './administration.component';
import { ListeFranchiseComponent } from '../../franchise/liste-franchise/liste-franchise.component';
import { FiltreFranchiseComponent } from '../../franchise/filtre-franchise/filtre-franchise.component';
import { InfoFranchiseComponent } from '../../franchise/info-franchise/info-franchise.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('Administration page tests', () => {
  let spectator: Spectator<AdministrationComponent>;
  let comp: AdministrationComponent;
  const createComponent = createComponentFactory({
    component: AdministrationComponent,
    imports: [
        FontAwesomeTestingModule,
        RouterTestingModule,
        HttpClientTestingModule
    ],
    entryComponents: [
        ListeFranchiseComponent,
        FiltreFranchiseComponent,
        InfoFranchiseComponent
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
