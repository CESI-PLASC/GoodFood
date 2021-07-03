import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { AjouterFormuleModalComponent } from './ajouter-formule-modal.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

describe('Ajouter formule modal component tests', () => {
  let spectator: Spectator<AjouterFormuleModalComponent>;
  let comp: AjouterFormuleModalComponent;
  const createComponent = createComponentFactory({
    component: AjouterFormuleModalComponent,
    imports: [
      FontAwesomeTestingModule,
        FormsModule,
        ReactiveFormsModule
    ],
    providers: [
      NgbActiveModal
    ],
    entryComponents: [
    ]
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });
});
