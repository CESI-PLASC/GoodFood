import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Formule, IFormule } from 'src/app/shared/models/formule/formule';

@Component({
  selector: 'gf-formule-form',
  templateUrl: './formule-form.component.html',
  styleUrls: ['./formule-form.component.scss']
})
export class FormuleFormComponent implements OnInit {

  @Input()
  public formule: IFormule;

  @Output()
  public submitFormule: EventEmitter<IFormule> = new EventEmitter<IFormule>();

  constructor(private readonly fb: FormBuilder) { }

  public formuleForm: FormGroup = this.fb.group({
    designation: this.fb.control('', [Validators.required]),
    prix: this.fb.control('', [Validators.required])
  });

  ngOnInit(): void {
    if (this.formule) {
      this.formuleForm.patchValue(this.formule);
    }
  }

  public createFromForm(): Formule {
    return new Formule({id: this.formule?.id, ...this.formuleForm.value});
  }

  public save(): void {
    if (this.formuleForm.valid) {
      this.submitFormule.emit(this.createFromForm());
    }
  }

  public cancel(): void {
    this.submitFormule.emit();
  }
}
