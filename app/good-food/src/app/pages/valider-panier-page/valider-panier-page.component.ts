import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { loadStripe, Stripe, StripeCardElement } from '@stripe/stripe-js';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { Commande } from 'src/app/shared/models/commande';
import Paiement from 'src/app/shared/models/paiement';
import { environment } from 'src/environments/environment';
import { CommandeService } from './services/commande.service';

@Component({
  selector: 'gf-valider-panier-page',
  templateUrl: './valider-panier-page.component.html',
  styleUrls: ['./valider-panier-page.component.scss']
})
export class ValiderPanierPageComponent implements OnInit {

  public readonly icons = Icons.validation;
  public commande?: Commande;
  public stripe?: Stripe;

  constructor(private route: ActivatedRoute, private readonly commandeService: CommandeService) {}

  ngOnInit(): void {
    loadStripe(environment.stripe_pk).then(stripe => {
      this.stripe = stripe;
    });

    this.route.params.subscribe(params => {
      this.commandeService.getOne(params.idCommande).subscribe(commande => {
        this.commande = commande;
      });
    })
  }
}
