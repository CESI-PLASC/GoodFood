import { Component, OnInit } from '@angular/core';
import { Icons } from '../../../shared/constants/icons.constant';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { IAdresse } from '../../../shared/models/adresse';
import { ILocalisation } from '../../../shared/models/Localisation';
import { faStar } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'gf-selecteur-adresse-list-modal',
  templateUrl: './selecteur-adresse-list-modal.component.html',
  styleUrls: ['./selecteur-adresse-list-modal.component.scss']
})
export class SelecteurAdresseListModalComponent implements OnInit {

  public icons = Icons.validation;
  public faStar = faStar;
  public localisations: ILocalisation[];

  constructor(private readonly activeModal: NgbActiveModal) { }

  ngOnInit(): void {
    this.localisations.sort(a => a.preferee ? -1 : 1);
  }

  public close(adresse?: IAdresse): void {
    if (adresse) {
      this.activeModal.close(adresse);
    } else {
      this.activeModal.close();
    }
  }
}
