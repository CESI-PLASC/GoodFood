import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FooterComponent } from './footer.component';
import { RouterTestingModule } from '@angular/router/testing';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { NgbCollapseModule } from '@ng-bootstrap/ng-bootstrap';

describe('Footer component tests', () => {
  let spectator: Spectator<FooterComponent>;
  let comp: FooterComponent;
  const createComponent = createComponentFactory({
    component: FooterComponent,
    imports: [
      RouterTestingModule,
        FontAwesomeTestingModule,
        NgbCollapseModule,
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
