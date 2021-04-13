import { Component, Input } from '@angular/core';
import { Commande } from 'src/app/shared/models/commande';

@Component({
  selector: 'gf-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent {
  @Input() commande: Commande;

  constructor() {}

  ngOnInit(): void {}
}
