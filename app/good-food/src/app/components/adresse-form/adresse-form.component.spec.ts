import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { AdresseFormComponent } from './adresse-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('Adresse form component tests', () => {
  let spectator: Spectator<AdresseFormComponent>;
  let comp: AdresseFormComponent;
  const createComponent = createComponentFactory({
    component: AdresseFormComponent,
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
