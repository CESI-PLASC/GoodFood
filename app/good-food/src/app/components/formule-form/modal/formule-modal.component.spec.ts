import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FormuleModalComponent } from './formule-modal.component';
import { NgbActiveModal, NgbModalModule } from '@ng-bootstrap/ng-bootstrap';
import { FormuleFormComponent } from '../formule-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { RouterTestingModule } from '@angular/router/testing';

describe('Formule modal tests', () => {
  let spectator: Spectator<FormuleModalComponent>;
  let comp: FormuleModalComponent;
  const createComponent = createComponentFactory({
    component: FormuleModalComponent,
    imports: [
        NgbModalModule,
        FormsModule,
        ReactiveFormsModule,
        FontAwesomeTestingModule,
        HttpClientTestingModule,
        RouterTestingModule,
    ],
    providers: [
        NgbActiveModal,
    ],
    entryComponents: [
      FormuleFormComponent
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
