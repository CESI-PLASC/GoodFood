import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { NavbarComponent } from './navbar.component';
import { RouterTestingModule } from '@angular/router/testing';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { NgbCollapseModule } from '@ng-bootstrap/ng-bootstrap';

describe('Navbar component tests', () => {
  let spectator: Spectator<NavbarComponent>;
  let comp: NavbarComponent;
  const createComponent = createComponentFactory({
    component: NavbarComponent,
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
