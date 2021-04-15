import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { CatalogueFiltreComponent } from './catalogue-filtre.component';
import { SelectBoxComponent } from '../../select-box/select-box.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

describe('Catalogue filtre component tests', () => {
  let spectator: Spectator<CatalogueFiltreComponent>;
  let comp: CatalogueFiltreComponent;
  const createComponent = createComponentFactory({
    component: CatalogueFiltreComponent,
    imports: [
        FontAwesomeTestingModule
    ],
    entryComponents: [
        SelectBoxComponent
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
