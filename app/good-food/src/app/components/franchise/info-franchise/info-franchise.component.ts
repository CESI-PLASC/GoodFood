import { Input } from '@angular/core';
import { Component } from '@angular/core';
import { Franchise } from 'src/app/shared/models/franchise/franchise';

@Component({
  selector: 'gf-info-franchise',
  templateUrl: './info-franchise.component.html',
  styleUrls: ['./info-franchise.component.scss']
})
export class InfoFranchiseComponent {
  @Input() public franchise: Franchise;

  /** Permet d'indiquer si l'on souhaite afficher ou non les actions (Livraison, Emporter)
   * Les actions sont affichées si === undefined || true
   * Les actions sont désactivées si === false
   */
  @Input() public actions?: boolean;
}
