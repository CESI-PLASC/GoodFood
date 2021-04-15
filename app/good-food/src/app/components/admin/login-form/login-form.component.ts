import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'gf-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.scss']
})
export class LoginFormComponent implements OnInit {

  constructor(private readonly fb: FormBuilder) { }

  public connectForm: FormGroup = this.fb.group({
    login: this.fb.control('', Validators.required),
    password: this.fb.control('', Validators.required)
  });

  ngOnInit(): void {
  }

  public signup(): void {
    console.log(this.connectForm.value);
  }

}
