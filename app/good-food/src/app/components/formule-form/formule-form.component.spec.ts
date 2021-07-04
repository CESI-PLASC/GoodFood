import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FormuleFormComponent } from './formule-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

describe('Adresse form component tests', () => {
  let spectator: Spectator<FormuleFormComponent>;
  let comp: FormuleFormComponent;
  const createComponent = createComponentFactory({
    component: FormuleFormComponent,
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
