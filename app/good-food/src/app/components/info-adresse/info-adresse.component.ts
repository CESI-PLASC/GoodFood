import { Component, Input, OnInit } from '@angular/core';
import { Adresse } from 'src/app/shared/models/adresse';

@Component({
  selector: 'gf-info-adresse',
  templateUrl: './info-adresse.component.html',
  styleUrls: ['./info-adresse.component.scss']
})
export class InfoAdresseComponent implements OnInit {

  @Input() adresse: Adresse;

  constructor() { }

  ngOnInit(): void {
  }

}
