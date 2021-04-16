import { Component, EventEmitter, forwardRef, Input, OnInit, Output } from '@angular/core';
import { ControlValueAccessor, NG_VALUE_ACCESSOR } from '@angular/forms';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Icons } from 'src/app/shared/constants/icons.constant';
import MethodePaiement, { MethodePaiementCreerSansUtilisateur } from 'src/app/shared/models/methode-paiement/methode-paiement';
import Utilisateur from 'src/app/shared/models/utilisateur/utilisateur';
import { SelecteurPaiementListModalComponent } from './modal/selecteur-paiement-list-modal.component';

@Component({
  selector: 'gf-selecteur-paiement',
  templateUrl: './selecteur-paiement.component.html',
  styleUrls: ['./selecteur-paiement.component.scss'],
})
export class SelecteurPaiementComponent implements OnInit {
  @Input() titre: string;
  @Input() methodesPaiement: MethodePaiement[];

  @Input() methodePaiement?: MethodePaiement;
  @Output() methodePaiementChange = new EventEmitter<MethodePaiement | MethodePaiementCreerSansUtilisateur | undefined>()

  public readonly icons = Icons.validation;

  constructor(private readonly modalService: NgbModal) {}

  ngOnInit(): void {}

  public openModal(): void {
    const modalRef = this.modalService.open(SelecteurPaiementListModalComponent, {
      size: 'xl',
      centered: true
    });

    modalRef.componentInstance.methodesPaiement = this.methodesPaiement;
    modalRef.result.then((result?: MethodePaiement | MethodePaiementCreerSansUtilisateur) => {
      this.methodePaiementChange.emit(result);
    });
  }
}
