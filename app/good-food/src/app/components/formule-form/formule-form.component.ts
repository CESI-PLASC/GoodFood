import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FormuleWithFranchises, IFormule } from 'src/app/shared/models/formule/formule';
import { AdministrationFormulesService } from 'src/app/pages/administration-formules-page/services/administration-formules.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FranchiseService } from 'src/app/pages/franchise-page/services/franchise.service';
import { Franchise } from 'src/app/shared/models/franchise/franchise';
import { AuthService } from 'src/app/security/services/auth/auth.service';
import { UserService } from 'src/app/security/services/user/user.service';

@Component({
  selector: 'gf-formule-form',
  templateUrl: './formule-form.component.html',
  styleUrls: ['./formule-form.component.scss']
})
export class FormuleFormComponent implements OnInit {

  public franchise: Franchise;

  @Input()
  public formule: IFormule;

  @Output()
  public submitFormule: EventEmitter<IFormule> = new EventEmitter<IFormule>();

  constructor(private readonly fb: FormBuilder, 
    private readonly formuleService: AdministrationFormulesService,
    public router: Router,
    private readonly franchiseService: FranchiseService,
    private readonly userService: UserService) { }

  public formuleForm: FormGroup = this.fb.group({
    designation: this.fb.control('', [Validators.required]),
    prix: this.fb.control('', [Validators.required])
  });

  ngOnInit(): void {
    if (this.formule) {
      this.formuleForm.patchValue(this.formule);
    }
    if (this.userService.currentUser) {
      this.franchiseService.getFranchise(this.userService.currentUser.franchiseId).subscribe(result => this.franchise = result);
    }
  }

  public createFromForm(): FormuleWithFranchises {
    return new FormuleWithFranchises({id: this.formule?.id, ...this.formuleForm.value, franchises: [this.franchise]});
  }

  public save(): void {
    if (this.formuleForm.valid) {
      this.submitFormule.emit(this.createFromForm());
    }
  }

  public cancel(): void {
    this.submitFormule.emit();
  }

  public ajouterFormule():void {
    this.formuleService.createFormule(this.createFromForm());
    let currentUrl = this.router.url;
      this.router.navigateByUrl('/', {skipLocationChange: true}).then(() => {
          this.router.navigate([currentUrl]);
          console.log(currentUrl);
      });
  }
}
