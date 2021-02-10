import { Component, Input, OnInit } from '@angular/core';
import { Panier } from 'src/app/pages/valider-panier-page/services/commande.service';

@Component({
  selector: 'app-mon-panier',
  templateUrl: './mon-panier.component.html',
  styleUrls: ['./mon-panier.component.scss']
})
export class MonPanierComponent implements OnInit {

  @Input() panier: Panier;

  constructor() { }

  ngOnInit(): void {
  }

}
