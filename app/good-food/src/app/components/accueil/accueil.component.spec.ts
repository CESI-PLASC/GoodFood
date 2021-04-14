import { AccueilComponent } from './accueil.component';
import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';

describe('Accueil component tests', () => {
  let spectator: Spectator<AccueilComponent>;
  let comp: AccueilComponent;
  const createComponent = createComponentFactory({
    component: AccueilComponent,
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
