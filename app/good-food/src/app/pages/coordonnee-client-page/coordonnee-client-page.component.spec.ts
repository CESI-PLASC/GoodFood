import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { CoordonneeClientPageComponent } from './coordonnee-client-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Coordonnee client page tests', () => {
  let spectator: Spectator<CoordonneeClientPageComponent>;
  let comp: CoordonneeClientPageComponent;
  const createComponent = createComponentFactory({
    component: CoordonneeClientPageComponent,
    imports: [
        FormsModule,
        ReactiveFormsModule
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
