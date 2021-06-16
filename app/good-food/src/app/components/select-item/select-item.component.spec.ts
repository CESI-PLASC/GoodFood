import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { SelectItemComponent } from './select-item.component';
import { NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';

describe('Select item component tests', () => {
  let spectator: Spectator<SelectItemComponent>;
  let comp: SelectItemComponent;
  const createComponent = createComponentFactory({
    component: SelectItemComponent,
    imports: [
      NgbDropdownModule
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
