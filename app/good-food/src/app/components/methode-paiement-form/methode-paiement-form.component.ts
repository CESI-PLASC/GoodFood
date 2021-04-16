import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MethodePaiementCreer } from 'src/app/shared/models/methode-paiement/methode-paiement';

@Component({
  selector: 'gf-methode-paiement-form',
  templateUrl: './methode-paiement-form.component.html',
  styleUrls: ['./methode-paiement-form.component.scss']
})
export class MethodePaiementFormComponent implements OnInit {

  @Output()
  public submitMethodePaiement: EventEmitter<MethodePaiementCreer> = new EventEmitter<MethodePaiementCreer>();

  public methodePaiementForm: FormGroup = this.fb.group({
    name: this.fb.control('', [Validators.required]),
    numero: this.fb.control('', [Validators.required, Validators.pattern(/^\d{4}(-\d{4}){3}$/)]),
    dateExpire: this.fb.control('', [Validators.required, Validators.pattern(/^\d{2}-\d{4}$/)]),
    cvc: this.fb.control('', [Validators.required, Validators.pattern(/^\d{3}$/)]),
  });

  constructor(private readonly fb: FormBuilder) { }

  ngOnInit(): void {}

  public createFromForm(): MethodePaiementCreer {
    const [, expireMois, expireAnnee] = (this.methodePaiementForm.value.cvc as string).match(/^(\d{2})-(\d{4})$/);

    return {
      type: "carte",
      carte: {
        expireAnnee: parseInt(expireAnnee),
        expireMois: parseInt(expireMois),
        numero: this.methodePaiementForm.value.numero,
        cvc: this.methodePaiementForm.value.cvc
      }
    };
  }

  public save(): void {
    if (this.methodePaiementForm.valid) {
      this.submitMethodePaiement.emit(this.createFromForm());
    }
  }

  public cancel(): void {
    this.submitMethodePaiement.emit();
  }
}
