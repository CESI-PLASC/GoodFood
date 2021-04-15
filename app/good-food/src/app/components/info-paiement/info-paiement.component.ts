import { Component, Input, OnInit } from '@angular/core';
import MethodePaiement from 'src/app/shared/models/methode-paiement';

@Component({
  selector: 'gf-info-paiement',
  templateUrl: './info-paiement.component.html',
  styleUrls: ['./info-paiement.component.scss']
})
export class InfoPaiementComponent implements OnInit {

  @Input() methodePaiement: MethodePaiement;

  constructor() { }

  ngOnInit(): void {
  }

}
