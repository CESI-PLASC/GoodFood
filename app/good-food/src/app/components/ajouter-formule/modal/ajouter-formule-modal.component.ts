import { Component, OnInit } from '@angular/core';
import { Icons } from '../../../shared/constants/icons.constant';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { faStar } from '@fortawesome/free-solid-svg-icons';
import { IFormule } from 'src/app/shared/models/formule/formule';

@Component({
  selector: 'gf-ajouter-formule-modal',
  templateUrl: './ajouter-formule-modal.component.html',
  styleUrls: ['./ajouter-formule-modal.component.scss']
})
export class AjouterFormuleModalComponent implements OnInit {

  public icons = Icons.validation;
  public faStar = faStar;

  constructor(private readonly activeModal: NgbActiveModal) { }

  ngOnInit(): void {
  }

  public close(formule?: IFormule): void {
    if (formule) {
      this.activeModal.close(formule);
    } else {
      this.activeModal.close();
    }
  }
}
