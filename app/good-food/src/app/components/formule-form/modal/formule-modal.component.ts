import { Component } from '@angular/core';
import { Icons } from '../../../shared/constants/icons.constant';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { IFormule } from 'src/app/shared/models/formule/formule';

@Component({
  selector: 'gf-formule-modal',
  templateUrl: './formule-modal.component.html'
})
export class FormuleModalComponent {
  public formule: IFormule;
  public icons = Icons.validation;
  public isDisabled = true;

  constructor(private readonly activeModal: NgbActiveModal) { }

  public close(formule?: IFormule): void {
    if (formule) {
      this.activeModal.close(formule);
    } else {
      this.activeModal.close();
    }
  }

}
