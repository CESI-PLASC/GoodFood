import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { loadStripe, Stripe } from '@stripe/stripe-js';
import { Commande } from 'src/app/shared/models/commande';
import { environment } from 'src/environments/environment';
import { CommandeService } from './services/commande.service';

@Component({
  selector: 'gf-valider-panier-page',
  templateUrl: './valider-panier-page.component.html',
  styleUrls: ['./valider-panier-page.component.scss']
})
export class ValiderPanierPageComponent implements OnInit {

  public commande?: Commande;
  public stripe?: Stripe;

  constructor(
      private route: ActivatedRoute,
      private readonly commandeService: CommandeService) {}

  ngOnInit(): void {
    loadStripe(environment.stripe_pk).then(stripe => {
      this.stripe = stripe;
    });

    this.route.params.subscribe(params => {
      this.commandeService.getOne(params.idCommande).subscribe(commande => {
        this.commande = commande;
      });
    });
  }

  public valideCommande(): void {
    console.log(this.commande);
  }
}
