import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { loadStripe, Stripe } from '@stripe/stripe-js';
import * as _ from 'lodash';
import { Commande } from 'src/app/shared/models/commande/commande';
import MethodePaiement, {
  MethodePaiementCreerSansUtilisateur,
} from 'src/app/shared/models/methode-paiement/methode-paiement';
import { CommandeService } from 'src/app/shared/services/commande/commande.service';
import { environment } from 'src/environments/environment';
import { ValiderPanierService } from './services/valider-panier.service';

@Component({
  selector: 'gf-valider-panier-page',
  templateUrl: './valider-panier-page.component.html',
  styleUrls: ['./valider-panier-page.component.scss'],
})
export class ValiderPanierPageComponent implements OnInit {
  public _ = _;
  public stripe?: Stripe;

  // Gestion des chargements
  public chargement?: 'paiement';

  //#region Gestion des erreurs
  public erreurs: Record<string, string> = {};
  //#endregion

  //#region Gestion de la méthode de paiement
  public methodesPaiement: MethodePaiement[] = [];
  private _methodePaiement?: MethodePaiement;
  public get methodePaiement(): MethodePaiement | undefined {
    return this._methodePaiement;
  }
  public set methodePaiement(methodePaiement: MethodePaiement | undefined) {
    if (!methodePaiement) {
      this.erreurs['methodePaiement'] =
        'Aucune méthode de paiement sélectionnée';
    } else if ('methodePaiement' in this.erreurs) {
      delete this.erreurs['methodePaiement'];
    }
    this._methodePaiement = methodePaiement;
  }

  // Sélection d'une nouvelle méthode de paiement via le sélecteur
  public methodePaiementChange(
    methode?: MethodePaiement | MethodePaiementCreerSansUtilisateur
  ) {
    // Aucune méthode de paiement sélectionnée
    if (!methode) {
      this.methodePaiement = undefined;
    }

    // Sélection d'une méthode de paiement existante
    else if ('id' in methode) {
      this.methodePaiement = methode;
    }

    // Création d'une nouvelle méthode de paiement
    else {
      this.validerPanierService
        .creerMethodePaiementUtilisateur({
          ...methode,
          utilisateurId: this.commande.utilisateur.id,
        })
        .subscribe({
          next: (methode) => {
            this.methodePaiement = methode;
          },
        });
    }
  }

  //#endregion

  //#region Gestion de la commande
  private _commande?: Commande;
  public get commande(): Commande | undefined {
    return this._commande;
  }
  public set commande(commande: Commande | undefined) {
    if (!commande) {
      this.erreurs['commande'] = 'Commande introuvable';
    } else if (!commande.structureValide()) {
      this.erreurs['commande'] =
        "La structure de la commande n'est pas correcte";
    } else if ('commande' in this.erreurs) {
      delete this.erreurs['commande'];
    }
    this._commande = commande;
  }
  //#endregion

  constructor(
    private route: ActivatedRoute,
    private validerPanierService: ValiderPanierService,
    private commandeService: CommandeService,
    private router: Router
  ) {
    this.methodePaiement = undefined;
    this.commande = undefined;
  }

  ngOnInit(): void {
    loadStripe(environment.stripe_pk).then((stripe) => {
      this.stripe = stripe;
    });

    this.route.params.subscribe((params) => {
      this.commandeService.getOne(params.idCommande).subscribe((commande) => {
        this.commande = commande;

        this.validerPanierService
          .methodesPaiementUtilisateur(this.commande.utilisateur.id)
          .subscribe((methodes) => {
            this.methodesPaiement = methodes;
          });
      });
    });
  }

  public validerCommande(): void {
    if (_.isEmpty(this.erreurs)) {
      this.chargement = 'paiement';
      this.validerPanierService
        .payerCommande({
          idCommande: this.commande.id,
          idPaiementMethode: this.methodePaiement.id,
        })
        .subscribe({
          next: () => {
            this.chargement = undefined;
            this.router.navigate([`/franchise`]);
          },
        });
    }
  }
}
