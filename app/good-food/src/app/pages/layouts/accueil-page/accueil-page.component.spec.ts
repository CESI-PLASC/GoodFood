import { AccueilPageComponent } from './accueil-page.component';
import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';

describe('Accueil page tests', () => {
  let spectator: Spectator<AccueilPageComponent>;
  let comp: AccueilPageComponent;
  const createComponent = createComponentFactory({
    component: AccueilPageComponent,
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
