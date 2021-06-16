import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { CoordonneeClientPageComponent } from './coordonnee-client-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterTestingModule } from '@angular/router/testing';

describe('Coordonnee client page tests', () => {
  let spectator: Spectator<CoordonneeClientPageComponent>;
  let comp: CoordonneeClientPageComponent;
  const createComponent = createComponentFactory({
    component: CoordonneeClientPageComponent,
    imports: [
        FormsModule,
        ReactiveFormsModule,
        RouterTestingModule
    ],
    entryComponents: [
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
