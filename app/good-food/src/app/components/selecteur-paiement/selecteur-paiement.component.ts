import { Component, forwardRef, Input, OnInit } from '@angular/core';
import { NG_VALUE_ACCESSOR } from '@angular/forms';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Icons } from 'src/app/shared/constants/icons.constant';
import MethodePaiement from 'src/app/shared/models/methode-paiement';
import { SelecteurPaiementListModalComponent } from './modal/selecteur-paiement-list-modal.component';

@Component({
  selector: 'gf-selecteur-paiement',
  templateUrl: './selecteur-paiement.component.html',
  styleUrls: ['./selecteur-paiement.component.scss'],
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => SelecteurPaiementComponent),
      multi: true
    }
  ]
})
export class SelecteurPaiementComponent implements OnInit {
  @Input() titre: string;
  @Input() methodesPaiement: MethodePaiement[];

  public readonly icons = Icons.validation;

  public methodePaiement: MethodePaiement;

  get value(): MethodePaiement {
    return this.methodePaiement;
  }

  set value(value) {
    if (value !== undefined && this.methodePaiement !== value){
      this.methodePaiement = value;
      this.onChange();
      this.onTouch();
    }
  }

  onChange: any = () => {};
  onTouch: any = () => {};

  constructor(private readonly modalService: NgbModal) {}

  ngOnInit(): void {}

  public openModal(): void {
    const modalRef = this.modalService.open(SelecteurPaiementListModalComponent, {
      size: 'xl',
      centered: true
    });

    modalRef.componentInstance.methodesPaiement = this.methodesPaiement;
    modalRef.result.then((result: MethodePaiement) => {
      if (result) {
        this.value = result;
      }
    });
  }
}
