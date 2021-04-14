import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { Commande } from 'src/app/shared/models/commande';
import { CommandeService } from './services/commande.service';
import { Franchise } from '../../shared/models/franchise';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { AdresseModalComponent } from '../../components/adresse-box/modal/adresse-modal.component';
import { Adresse, IAdresse } from '../../shared/models/adresse';

@Component({
  selector: 'gf-valider-panier-page',
  templateUrl: './valider-panier-page.component.html',
  styleUrls: ['./valider-panier-page.component.scss']
})
export class ValiderPanierPageComponent implements OnInit {

  public commande?: Commande;
  public clientSecret?: string;

  constructor(
      private route: ActivatedRoute,
      private readonly commandeService: CommandeService) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.commandeService.getOne(params.idCommande).subscribe(commande => {
        this.commande = commande;
      });

      this.commandeService.getPaiementIntent(params.idCommande).subscribe(paiement => {
        this.clientSecret = paiement.client_secret;
      });
    });
  }

  public valideCommande(): void {
    console.log(this.commande);
  }

}
