import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { InfoFranchiseComponent } from './info-franchise.component';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Info franchise component tests', () => {
  let spectator: Spectator<InfoFranchiseComponent>;
  let comp: InfoFranchiseComponent;
  const createComponent = createComponentFactory({
    component: InfoFranchiseComponent,
    imports: [

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
