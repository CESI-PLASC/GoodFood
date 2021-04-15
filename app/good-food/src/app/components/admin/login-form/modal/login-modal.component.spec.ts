import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { LoginModalComponent } from './login-modal.component';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { LoginFormComponent } from '../login-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';

describe('Info adresse component tests', () => {
  let spectator: Spectator<LoginModalComponent>;
  let comp: LoginModalComponent;
  const createComponent = createComponentFactory({
    component: LoginModalComponent,
    imports: [
        ReactiveFormsModule,
        FormsModule,
        FontAwesomeTestingModule
    ],
    providers: [
      NgbActiveModal
    ],
    entryComponents: [
        LoginFormComponent
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
