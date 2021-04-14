import { AfterViewInit, Component, EventEmitter, Input, OnInit, Output, ViewChild } from '@angular/core';
import {Stripe, StripeCardElement} from "@stripe/stripe-js"

@Component({
  selector: 'gf-paiement-carte',
  templateUrl: './paiement-carte.component.html',
  styleUrls: ['./paiement-carte.component.scss']
})
export class PaiementCarteComponent implements OnInit, AfterViewInit {

  @ViewChild("conteneur") conteneur;
  @ViewChild("erreur") erreur;
  @ViewChild("paymentForm") form;
  @Input() stripe: Stripe;
  @Output() initCard = new EventEmitter<StripeCardElement>();

  constructor() {}

  ngOnInit(): void {}

  async ngAfterViewInit(): Promise<void> {

    // Affichage du composant pour saisir une carte
    const elements = this.stripe.elements();
    const card = elements.create("card", {style: {
      base: {
        iconColor: "black",
      }
    }});

    // Gestion de l'affichage des erreurs
    card.on("change", (event) => {
      if(event.error){
        this.erreur.nativeElement.textContent = event.error.message;
      } else {
        this.erreur.nativeElement.textContent = "";
      }
    })
    card.mount(this.conteneur.nativeElement);

    this.initCard.emit(card);
  }
}
