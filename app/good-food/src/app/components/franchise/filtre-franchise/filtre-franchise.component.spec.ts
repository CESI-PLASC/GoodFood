import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FiltreFranchiseComponent } from './filtre-franchise.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

describe('FiltreFranchse component tests', () => {
  let spectator: Spectator<FiltreFranchiseComponent>;
  let comp: FiltreFranchiseComponent;
  const createComponent = createComponentFactory({
    component: FiltreFranchiseComponent,
    imports: [
      FontAwesomeTestingModule
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
