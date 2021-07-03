import { Component, forwardRef, Input, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { NG_VALUE_ACCESSOR } from '@angular/forms';
import { Icons } from '../../shared/constants/icons.constant';
import { AjouterFormuleModalComponent } from './modal/ajouter-formule-modal.component';

@Component({
  selector: 'gf-ajouter-formule',
  templateUrl: './ajouter-formule.component.html',
  styleUrls: ['./ajouter-formule.component.scss'],
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => AjouterFormuleComponent),
      multi: true
    }
  ]
})
export class AjouterFormuleComponent implements OnInit {


  public readonly icons = Icons.validation;


  onChange: any = () => {};
  onTouch: any = () => {};


  constructor(private modalService: NgbModal) { }

  ngOnInit(): void {
  }

  registerOnChange(fn: any): void {
    this.onChange = fn;
  }

  registerOnTouched(fn: any): void {
    this.onTouch = fn;
  }


  public openModal(): void {
    const modalRef = this.modalService.open(AjouterFormuleModalComponent, {
      size: 'xl',
      centered: true
    });
  }
}
