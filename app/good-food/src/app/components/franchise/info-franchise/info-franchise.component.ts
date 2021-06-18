import { Input } from '@angular/core';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import * as moment from 'moment';
import { Franchise } from 'src/app/shared/models/franchise/franchise';
import { CommandeService } from 'src/app/shared/services/commande/commande.service';

@Component({
  selector: 'gf-info-franchise',
  templateUrl: './info-franchise.component.html',
  styleUrls: ['./info-franchise.component.scss'],
})
export class InfoFranchiseComponent {
  @Input() public franchise?: Franchise;

  /** Permet d'indiquer si l'on souhaite afficher ou non les actions (Livraison, Emporter)
   * Les actions sont affichées si === undefined || true
   * Les actions sont désactivées si === false
   */
  @Input() public actions?: boolean;

  constructor(
    private _router: Router,
    private _commandeService: CommandeService
  ) {}

  public creerCommande(type: 'livraison' | 'emporter') {
    if (this.franchise?.id) {
      this._commandeService
        .creer({
          franchiseId: this.franchise.id,
          // TODO Il faut que la clé primaire de Statut soit un code
          statutId: 1,
          // TODO Il faut ajouter l'identifiant de l'utilisateur connecté
          utilisateurId: 5,
          dateCreation: moment().format('YYYY-MM-DD'),
        })
        .subscribe({
          next: (commande) => {
            if (commande.id) {
              this._router.navigate(['commande', commande.id]);
            }
          },
        });
    }
  }
}
