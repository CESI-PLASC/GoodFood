import { Component, OnInit } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Icons } from '../../../shared/constants/icons.constant';

@Component({
  selector: 'gf-login-modal',
  templateUrl: './login-modal.component.html',
  styleUrls: ['./login-modal.component.scss']
})
export class LoginModalComponent implements OnInit {

  public icons = Icons.validation;

  constructor(private readonly activeModal: NgbActiveModal) { }

  ngOnInit(): void {
  }

  public close(): void {
    this.activeModal.close();
  }

}
