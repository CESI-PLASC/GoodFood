import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { ListeFranchiseComponent } from './liste-franchise.component';
import { InfoFranchiseComponent } from '../info-franchise/info-franchise.component';
import { FiltreFranchiseComponent } from '../filtre-franchise/filtre-franchise.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Liste franchise component tests', () => {
  let spectator: Spectator<ListeFranchiseComponent>;
  let comp: ListeFranchiseComponent;
  const createComponent = createComponentFactory({
    component: ListeFranchiseComponent,
    imports: [
      FontAwesomeTestingModule
    ],
    entryComponents: [
      InfoFranchiseComponent,
        FiltreFranchiseComponent
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
