import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { LoginModalComponent } from '../../components/login-form/modal/login-modal.component';
import { ActivatedRoute, Router } from '@angular/router';
import { map } from 'rxjs/operators';

@Component({
  selector: 'gf-coordonnee-client-page',
  templateUrl: './coordonnee-client-page.component.html',
  styleUrls: ['./coordonnee-client-page.component.scss']
})
export class CoordonneeClientPageComponent implements OnInit {

  public isConnected = true;
  private commandeId: string;

  constructor(private readonly fb: FormBuilder,
              private readonly modalService: NgbModal,
              private readonly router: Router,
              private readonly activeRoute: ActivatedRoute) { }

  public infoForm: FormGroup = this.fb.group({
    nom: this.fb.control('', Validators.required),
    prenom: this.fb.control('', Validators.required),
    email: this.fb.control('', Validators.required),
    tel: this.fb.control('', Validators.required),
  });

  ngOnInit(): void {
    this.activeRoute.params.subscribe(params => this.commandeId = params['idCommande']);
  }

  public openSignupModal(): void {
    this.modalService.open(LoginModalComponent, {
      centered: true
    });
  }

  public envoyerCoordonnee(): void {
    this.router.navigate(['commande', this.commandeId, 'validation']);
  }
}
