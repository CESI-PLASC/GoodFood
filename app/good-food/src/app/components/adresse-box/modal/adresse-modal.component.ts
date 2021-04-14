import { Component, OnInit } from '@angular/core';
import { Icons } from '../../../shared/constants/icons.constant';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { IAdresse } from '../../../shared/models/adresse';

@Component({
  selector: 'gf-adresse-modal',
  templateUrl: './adresse-modal.component.html'
})
export class AdresseModalComponent {
  public adresse: IAdresse;
  public icons = Icons.validation;
  public isDisabled = true;

  constructor(private readonly activeModal: NgbActiveModal) { }

  public close(adresse?: IAdresse): void {
    if (adresse) {
      this.activeModal.close(adresse);
    } else {
      this.activeModal.close();
    }
  }

}
