import { ConditionsComponent } from './conditions.component';
import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';

describe('Conditions component tests', () => {
  let spectator: Spectator<ConditionsComponent>;
  let comp: ConditionsComponent;
  const createComponent = createComponentFactory({
    component: ConditionsComponent,
    imports: [
        NgbCarouselModule
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
