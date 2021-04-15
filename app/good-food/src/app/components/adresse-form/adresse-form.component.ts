import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Adresse, IAdresse } from '../../shared/models/adresse/adresse';

@Component({
  selector: 'gf-adresse-form',
  templateUrl: './adresse-form.component.html',
  styleUrls: ['./adresse-form.component.scss']
})
export class AdresseFormComponent implements OnInit {

  @Input()
  public adresse: IAdresse;

  @Output()
  public submitAddress: EventEmitter<IAdresse> = new EventEmitter<IAdresse>();

  constructor(private readonly fb: FormBuilder) { }

  public addressForm: FormGroup = this.fb.group({
    rue: this.fb.control('', [Validators.required]),
    codePostal: this.fb.control('', [Validators.required, Validators.pattern(/^\d{2}[ ]?\d{3}$/)]),
    ville: this.fb.control('', [Validators.required]),
    pays: this.fb.control('', [Validators.required]),
    complement: this.fb.control(''),
  });

  ngOnInit(): void {
    if (this.adresse) {
      this.addressForm.patchValue(this.adresse);
    }
  }

  public createFromForm(): Adresse {
    return new Adresse({id: this.adresse?.id, ...this.addressForm.value});
  }

  public save(): void {
    if (this.addressForm.valid) {
      this.submitAddress.emit(this.createFromForm());
    }
  }

  public cancel(): void {
    this.submitAddress.emit();
  }
}
