import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import MethodePaiement from 'src/app/shared/models/methode-paiement';

@Component({
  selector: 'gf-methode-paiement-form',
  templateUrl: './methode-paiement-form.component.html',
  styleUrls: ['./methode-paiement-form.component.scss']
})
export class MethodePaiementFormComponent implements OnInit {

  @Output()
  public methodePaiement: MethodePaiement;

  @Output()
  public submitMethodePaiement: EventEmitter<MethodePaiement> = new EventEmitter<MethodePaiement>();

  public methodePaiementForm: FormGroup = this.fb.group({
    name: this.fb.control('', [Validators.required]),
    numero: this.fb.control('', [Validators.required, Validators.pattern(/^\d{4}(-\d{4}){3}$/)]),
    dateExpire: this.fb.control('', [Validators.required, Validators.pattern(/^\d{2}-\d{4}$/)]),
    cvc: this.fb.control('', [Validators.required, , Validators.pattern(/^\d{3}$/)]),
  });

  constructor(private readonly fb: FormBuilder) { }

  ngOnInit(): void {
  }

  // public createFromForm(): MethodePaiement {
  //   return new MethodePaiement({
  //     id: this.methodePaiement?.id
  //   });
  // }

  public save(): void {
    if (this.methodePaiementForm.valid) {
      this.submitMethodePaiement.emit(); // Manque le renvoi
    }
  }

  public cancel(): void {
    this.submitMethodePaiement.emit();
  }
}
