import { Component, forwardRef, Input, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { IAdresse } from 'src/app/shared/models/adresse';
import Localisation, { ILocalisation } from 'src/app/shared/models/Localisation';
import { ControlValueAccessor, NG_VALUE_ACCESSOR } from '@angular/forms';
import { Icons } from '../../shared/constants/icons.constant';
import { SelecteurAdresseListModalComponent } from './modal/selecteur-adresse-list-modal.component';

@Component({
  selector: 'gf-selecteur-adresse',
  templateUrl: './selecteur-adresse.component.html',
  styleUrls: ['./selecteur-adresse.component.scss'],
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => SelecteurAdresseComponent),
      multi: true
    }
  ]
})
export class SelecteurAdresseComponent implements OnInit, ControlValueAccessor {

  @Input() public titre = 'Adresse';

  @Input() public localisations: ILocalisation[];

  public readonly icons = Icons.validation;

  public adresse: IAdresse;

  get value(): IAdresse {
    return this.adresse;
  }

  set value(value) {
    if (value !== undefined && this.adresse !== value){
      this.adresse = value;
      this.onChange(value);
      this.onTouch(value);
    }
  }

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

  writeValue(value: IAdresse): void {
    this.adresse = value;
  }

  public openModal(): void {
    const modalRef = this.modalService.open(SelecteurAdresseListModalComponent, {
      size: 'xl',
      centered: true
    });

    modalRef.componentInstance.localisations = this.localisations;
    modalRef.result.then((result: IAdresse) => {
      if (result) {
        this.value = result;
      }
    });
  }
}
