import { Component, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PanierAjoutProduitComponent } from 'src/app/components/panier/panier-ajout-produit/panier-ajout-produit.component';
import { Commande } from 'src/app/shared/models/commande/commande';
import { Contenu } from 'src/app/shared/models/contenu/contenu';
import { Contient } from 'src/app/shared/models/contient/contient';
import { Produit } from 'src/app/shared/models/produit/produit';
import { CommandeService } from 'src/app/shared/services/commande/commande.service';
import { ContientService } from 'src/app/shared/services/contient/contient.service';

@Component({
  selector: 'gf-commande-page',
  templateUrl: './commande-page.component.html',
  styleUrls: ['./commande-page.component.scss'],
})
export class CommandePageComponent implements OnInit {
  // Contient la commande actuelle
  public commande?: Commande;

  //#region Gestion de l'ajout d'un produit

  // Contient la formule pour laquelle on souhaite ajouter le produit
  public formuleSelectionnee?: Contenu;

  // Ajout d'un produit à la formule
  public ajouterProduit(contenu?: Contenu, produit?: Produit) {
    if (contenu?.id && produit?.id) {
      // Vérifie si le produit existe
      const contientExistant: Contient | undefined = contenu?.produits?.find(
        (contientCommande) => contientCommande.id?.produitId === produit.id
      );

      // TODO Si le produit existe déjà, modifie sa quantité
      if (contientExistant) {
        const quantite = (contientExistant.quantite || 0) + 1;

        this._contientService
          .modifier({
            id: {
              contenuId: contenu.id,
              produitId: produit.id,
            },
            quantite,
          })
          .subscribe({
            next: () => {
              contientExistant.quantite = quantite;
            },
          });
      }

      // Si le produit n'existe pas, l'ajoute
      else {
        this._contientService
          .creer({
            id: {
              contenuId: contenu.id,
              produitId: produit.id,
            },
          })
          .subscribe({
            next: (contient) => contenu?.produits?.push(contient),
          });
      }
    }
  }

  //#endregion

  constructor(
    private _route: ActivatedRoute,
    private _commandeService: CommandeService,
    private _contientService: ContientService
  ) {}

  ngOnInit(): void {
    // Chargement de la commande
    this._route.params.subscribe(({ idCommande }: { idCommande: string }) => {
      this._commandeService.getOne(parseInt(idCommande)).subscribe({
        next: (commande) => {
          this.commande = commande;
        },
      });
    });
  }
}
