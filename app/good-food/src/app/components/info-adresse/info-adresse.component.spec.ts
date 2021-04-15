import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { InfoAdresseComponent } from './info-adresse.component';

describe('Info adresse component tests', () => {
  let spectator: Spectator<InfoAdresseComponent>;
  let comp: InfoAdresseComponent;
  const createComponent = createComponentFactory({
    component: InfoAdresseComponent,
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
