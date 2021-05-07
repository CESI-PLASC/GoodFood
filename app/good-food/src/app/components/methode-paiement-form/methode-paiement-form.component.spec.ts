import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { MethodePaiementFormComponent } from './methode-paiement-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

describe('MethodePaiementFormComponent', () => {
  let spectator: Spectator<MethodePaiementFormComponent>;
  const createComponent = createComponentFactory({
    component: MethodePaiementFormComponent,
    imports: [
      FormsModule,
      ReactiveFormsModule,
    ]
  });

  let comp: MethodePaiementFormComponent;

  beforeEach(() => {
    spectator = createComponent();
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });
});
