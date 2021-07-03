import { PolitiqueComponent } from './politique.component';
import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';

describe('Politique component tests', () => {
  let spectator: Spectator<PolitiqueComponent>;
  let comp: PolitiqueComponent;
  const createComponent = createComponentFactory({
    component: PolitiqueComponent,
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
