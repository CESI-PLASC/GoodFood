import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { AjouterFormuleModalComponent } from './ajouter-formule-modal.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { FormuleFormModule } from '../../formule-form/formule-form.module';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { RouterTestingModule } from '@angular/router/testing';

describe('Ajouter formule modal component tests', () => {
  let spectator: Spectator<AjouterFormuleModalComponent>;
  const createComponent = createComponentFactory({
    component: AjouterFormuleModalComponent,
    imports: [
      FontAwesomeTestingModule,
        FormsModule,
        ReactiveFormsModule,
        FormuleFormModule,
        HttpClientTestingModule,
        RouterTestingModule,
    ],
    providers: [
      NgbActiveModal
    ],
    entryComponents: [
    ]
  });

  beforeEach(() => spectator = createComponent());

  it('Should create component', () => {
    expect(spectator.component).toBeDefined();
  });
});
