import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { InfoFranchiseComponent } from './info-franchise.component';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('Info franchise component tests', () => {
  let spectator: Spectator<InfoFranchiseComponent>;
  let comp: InfoFranchiseComponent;
  const createComponent = createComponentFactory({
    component: InfoFranchiseComponent,
    imports: [
      RouterTestingModule,
      HttpClientTestingModule,
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
