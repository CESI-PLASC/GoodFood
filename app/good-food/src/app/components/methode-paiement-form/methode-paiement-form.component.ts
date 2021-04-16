import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MethodePaiementCreer, MethodePaiementCreerSansUtilisateur } from 'src/app/shared/models/methode-paiement/methode-paiement';
import Utilisateur from 'src/app/shared/models/utilisateur/utilisateur';

@Component({
  selector: 'gf-methode-paiement-form',
  templateUrl: './methode-paiement-form.component.html',
  styleUrls: ['./methode-paiement-form.component.scss']
})
export class MethodePaiementFormComponent implements OnInit {

  @Output()
  public submitMethodePaiement: EventEmitter<MethodePaiementCreerSansUtilisateur> = new EventEmitter<MethodePaiementCreerSansUtilisateur>();

  public methodePaiementForm: FormGroup = this.fb.group({
    name: this.fb.control('', [Validators.required]),
    numero: this.fb.control('', [Validators.required, Validators.pattern(/^\d{4}(-\d{4}){3}$/)]),
    dateExpire: this.fb.control('', [Validators.required, Validators.pattern(/^\d{2}-\d{4}$/)]),
    cvc: this.fb.control('', [Validators.required, Validators.pattern(/^\d{3}$/)]),
  });

  constructor(private readonly fb: FormBuilder) { }

  ngOnInit(): void {}

  public createFromForm(): MethodePaiementCreerSansUtilisateur {
    const matches = (this.methodePaiementForm.value.dateExpire as string).match(/^(\d{2})-(\d{4})$/);

    return {
      type: "carte",
      carte: {
        expireAnnee: parseInt(matches[1]),
        expireMois: parseInt(matches[2]),
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
