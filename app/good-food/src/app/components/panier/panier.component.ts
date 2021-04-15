import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';
import { Commande } from 'src/app/shared/models/commande/commande';

@Component({
  selector: 'gf-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent {
  @Input() commande: Commande;

  constructor(private router: Router) {}

  async navigateToCommande() : Promise<void> {
    await this.router.navigate([`/franchise/${this.commande.franchise.id}/catalogue`]);
  }
}
