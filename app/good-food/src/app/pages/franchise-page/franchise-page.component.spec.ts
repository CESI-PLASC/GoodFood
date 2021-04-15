import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FranchisePageComponent } from './franchise-page.component';
import { ListeFranchiseComponent } from '../../components/franchise/liste-franchise/liste-franchise.component';
import { FiltreFranchiseComponent } from '../../components/franchise/filtre-franchise/filtre-franchise.component';
import { InfoFranchiseComponent } from '../../components/franchise/info-franchise/info-franchise.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Franchise page tests', () => {
  let spectator: Spectator<FranchisePageComponent>;
  let comp: FranchisePageComponent;
  const createComponent = createComponentFactory({
    component: FranchisePageComponent,
    imports: [
        FontAwesomeTestingModule
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
