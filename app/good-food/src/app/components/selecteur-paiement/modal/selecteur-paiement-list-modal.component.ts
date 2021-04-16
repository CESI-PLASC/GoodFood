import { Component, Input, OnInit } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Icons } from 'src/app/shared/constants/icons.constant';
import MethodePaiement, { MethodePaiementCreerSansUtilisateur } from 'src/app/shared/models/methode-paiement/methode-paiement';

@Component({
  selector: 'gf-selecteur-paiement-list-modal',
  templateUrl: './selecteur-paiement-list-modal.component.html',
  styleUrls: ['./selecteur-paiement-list-modal.component.scss']
})
export class SelecteurPaiementListModalComponent implements OnInit {

  public icons = Icons.validation;
  public methodesPaiement: MethodePaiement[];

  constructor(private readonly activeModal: NgbActiveModal) { }

  ngOnInit(): void {}

  public close(methode?: MethodePaiement | MethodePaiementCreerSansUtilisateur): void {
    if (methode) {
      this.activeModal.close(methode);
    } else {
      this.activeModal.close();
    }
  }
}
