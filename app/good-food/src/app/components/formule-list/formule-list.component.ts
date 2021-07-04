import { Input } from '@angular/core';
import { Component, Output, EventEmitter } from '@angular/core';
import { PanierService } from 'src/app/pages/catalogue-page/services/panier.service';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { Commande } from 'src/app/shared/models/commande/commande';
import { Contenu } from 'src/app/shared/models/contenu/contenu';
import { Contient } from 'src/app/shared/models/contient/contient';
import { Formule, IFormule } from 'src/app/shared/models/formule/formule';
import { Franchise } from 'src/app/shared/models/franchise/franchise';
import { ContenuService } from 'src/app/shared/services/contenu/contenu.service';
import { ContientService } from 'src/app/shared/services/contient/contient.service';

@Component({
  selector: 'gf-formule-list',
  templateUrl: './formule-list.component.html',
  styleUrls: ['./formule-list.component.scss'],
})
export class FormuleListComponent {
  // Gestion des icônes pour l'affichage
  public icons = Icons;

  // Gestion des formules dépliées
  public formulesAffichees: Record<number, boolean> = {};

  //Infos franchisé
  @Input() public franchise: Franchise;

  //#region Gestion de la formule selectionnée pour l'ajout de produit

  // Evénement pour indiquer qu'une nouvelle formule a été sélectionnée
  @Output() onFormuleSelectionnee = new EventEmitter<Contenu>();

  // Contient la formule sélectionnée
  private _formuleSelectionneeAjout?: Contenu;
  public set formuleSelectionneeAjout(contenu: Contenu) {
    this.onFormuleSelectionnee.emit(contenu);
    this._formuleSelectionneeAjout = contenu;
  }
  public get formuleSelectionneeAjout() {
    return this._formuleSelectionneeAjout;
  }

  //#endregion

  //#region Gestion de la commande
  public _commande?: Commande;
  @Input() public set commande(commande: Commande | undefined) {
    if (commande) {
      // Par défaut, déplie toutes les formules
      this.formulesAffichees = commande?.formules?.reduce(
        (contenus, contenu) => ({ ...contenus, [contenu.id]: false }),
        {} as Record<number, boolean>
      );

      // Par défaut sélectionne la première formule
      this.formuleSelectionneeAjout = commande?.formules[0];
    } else {
      this.formulesAffichees = {};
    }
    this._commande = commande;
  }
  public get commande(): Commande | undefined {
    return this._commande;
  }
  //#endregion

  //#region Gestion du sélecteur de formule
  @Input() public formules: IFormule[];
  public formuleSelectionnee: Formule;

  // Permet de voir la structure de la formule sélectionnée
  voirStructureFormule(): void {
    if (this.formuleSelectionnee) {
      alert(`Composition de la formule ${this.formuleSelectionnee.id}`);
    }
  }
  //#endregion

  //#region Gestion des formules de la commande

  // 2vénement pour indiquer qu'une formule a été ajoutée
  @Output() public onAjoutFormule: EventEmitter<Contenu> = new EventEmitter();

  // Permet d'ajouter une formule à la commande
  ajouterFormule(): void {
    if (this.commande?.id && this.formuleSelectionnee?.id) {
      // Enregistre la nouvelle formule en base de données
      this._contenuService
        .creer({
          formule: {
            id: this.formuleSelectionnee.id,
          },
          commande: {
            id: this.commande.id,
          },
        })
        .subscribe({
          next: (contenu) => {
            // Ajoute la nouvelle formule pour l'affichage
            this.commande?.formules?.push(contenu);

            // Déclenche un événement pour indiquer qu'une formule a été créée
            this.onAjoutFormule.emit(contenu);
          },
        });
    }
  }

  // Permet de retirer une formule à la commande
  retirerFormule(contenu: Contenu): void {
    if (this.commande?.formules) {
      if (confirm('Voulez-vous retirer cette formule de votre panier ?')) {
        // Supprime la formule de la base de données
        this._contenuService.supprimer(contenu.id).subscribe({
          next: () => {
            // Permet de ne plus afficher la formule
            this.commande.formules = this.commande.formules.filter(
              (cont) => cont.id !== contenu.id
            );
          },
        });
      }
    }
  }

  //#endregion

  //#region Gestion des produits des formules

  // Permet de retirer un produit
  public retirerProduit(contenu: Contenu, contient: Contient): void {
    if (this.commande?.formules && contenu.id && contient.produit?.id) {
      // Récupére la quantité du produit
      const quantite = contient.quantite || 1;

      // Si la quantité est supérieur à 1, ne retire qu'un seul produit
      if (quantite > 1) {
        this._contientService
          .modifier({
            id: {
              contenuId: contenu.id,
              produitId: contient.produit.id,
            },
            quantite: quantite - 1,
          })
          .subscribe(() => {
            contient.quantite -= 1;
          });
      }

      // Si la quantité du produit est de 1, retire le produit
      else {
        // Retire le produit en base de données
        this._contientService
          .supprimer(contenu.id, contient.produit.id)
          .subscribe({
            next: () => {
              // Retire le produit de l'affichage
              if (
                this.commande?.formules &&
                contenu.id &&
                contient.produit?.id
              ) {
                const contenuRetire = this.commande.formules.find(
                  (cont) => cont.id === contenu.id
                );
                if (contenuRetire) {
                  contenuRetire.produits = contenuRetire.produits?.filter(
                    (cont) => cont.produit?.id !== contient.produit.id
                  );
                }
              }
            },
          });
      }
    }
  }

  //#endregion

  constructor(
    public panierService: PanierService,
    private _contenuService: ContenuService,
    private _contientService: ContientService
  ) {}
}
