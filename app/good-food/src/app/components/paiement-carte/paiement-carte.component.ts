import { HttpClient } from '@angular/common/http';
import { AfterViewInit, Component, Input, OnInit, ViewChild } from '@angular/core';
import {loadStripe, Stripe, StripeCardElement, StripeElements} from "@stripe/stripe-js"
import { environment } from 'src/environments/environment';

@Component({
  selector: 'gf-paiement-carte',
  templateUrl: './paiement-carte.component.html',
  styleUrls: ['./paiement-carte.component.scss']
})
export class PaiementCarteComponent implements OnInit, AfterViewInit {

  @Input() clientSecret: string;
  @ViewChild("conteneur") conteneur;
  @ViewChild("erreur") erreur;
  @ViewChild("paymentForm") form;

  constructor(private readonly http: HttpClient) {
   }

  ngOnInit(): void {
  }

  async ngAfterViewInit(): Promise<void> {
    const stripe = await loadStripe(environment.stripe_pk);

    const elements = stripe.elements();
    const card = elements.create("card", {style: {
      base: {
        iconColor: "black",
      }
    }});

    card.on("change", (event) => {
      if(event.error){
        this.erreur.nativeElement.textContent = event.error.message;
      } else {
        this.erreur.nativeElement.textContent = "";
      }
    })

    card.mount(this.conteneur.nativeElement);

    this.form.nativeElement.addEventListener("submit", async (event) => {
      event.preventDefault();

      const resultat = await stripe.confirmCardPayment(this.clientSecret, {
        payment_method: {card}
      });

      if(resultat.error){
        this.erreur.nativeElement.textContent = resultat.error.message;
      } else {
        alert("Paiement réussi");
      }
      // stripeTokenHandler(result.token);
    })
  }
}
