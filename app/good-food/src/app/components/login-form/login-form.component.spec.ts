import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { LoginFormComponent } from './login-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

describe('Info adresse component tests', () => {
  let spectator: Spectator<LoginFormComponent>;
  let comp: LoginFormComponent;
  const createComponent = createComponentFactory({
    component: LoginFormComponent,
    imports: [
        ReactiveFormsModule,
        FormsModule
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
