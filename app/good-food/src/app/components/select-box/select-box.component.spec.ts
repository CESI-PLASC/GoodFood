import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { SelectBoxComponent } from './select-box.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

describe('Select box component tests', () => {
  let spectator: Spectator<SelectBoxComponent>;
  let comp: SelectBoxComponent;
  const createComponent = createComponentFactory({
    component: SelectBoxComponent,
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
