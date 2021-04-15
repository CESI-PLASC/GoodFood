import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { loadStripe, Stripe } from '@stripe/stripe-js';
import { Commande } from 'src/app/shared/models/commande';
import MethodePaiement from 'src/app/shared/models/methode-paiement';
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
  public methodesPaiement: MethodePaiement[] = [];

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

        this.commandeService.methodesPaiementUtilisateur(this.commande.utilisateur.id).subscribe(methodes => {
          this.methodesPaiement = methodes;
        })
      });
    });
  }

  public valideCommande(): void {
    console.log(this.commande);
  }
}
