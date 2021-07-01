import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AuthService } from '../../services/auth/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'gf-signin',
  templateUrl: './signin-page.component.html'
})
export class SigninPageComponent implements OnInit {

  public error = '';

  public signinForm: FormGroup = this.fb.group({
    email: this.fb.control(null, Validators.required),
    password: this.fb.control(null, Validators.required),
  });

  constructor(private readonly fb: FormBuilder, private readonly authService: AuthService, private readonly router: Router) { }

  ngOnInit(): void {
    this.signinForm.valueChanges.subscribe(() => this.error = '');
  }

  public signin(): void {
    if (this.signinForm.valid) {
      this.authService.signin(this.signinForm.value).subscribe(() => {
        // TODO ici redirection vers la page d'accueil des employés
        this.router.navigate(['home']).then();
      }, () => this.error = 'Votre email ou mot de passe est erroné.');
    }
  }
}
