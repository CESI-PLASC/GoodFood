import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Commande } from 'src/app/shared/models/commande/commande';
import { Contenu } from 'src/app/shared/models/contenu/contenu';
import { Formule } from 'src/app/shared/models/formule/formule';
import { Franchise } from 'src/app/shared/models/franchise/franchise';
import { Produit } from 'src/app/shared/models/produit/produit';
import { FormuleService } from 'src/app/shared/services/formule/formule.service';

@Component({
  selector: 'gf-panier-ajout-produit',
  templateUrl: './panier-ajout-produit.component.html',
  styleUrls: ['./panier-ajout-produit.component.scss'],
})
export class PanierAjoutProduitComponent implements OnInit {
  // Contient la commande actuelle
  @Input() commande?: Commande;

  // Infos du franchisé
  @Input() public franchise: Franchise;

  // Contient toutes les formules du franchisés
  public formules: Formule[] = [];

  // Gestion de la formule sélectionné pour l'ajout de produit
  @Output() onFormuleSelectionnee = new EventEmitter<Contenu>();

  constructor(private readonly _formuleService: FormuleService) {}

  ngOnInit(): void {
    // TODO Doit récupérer seulement les formules du franchisé de la commande
    this._formuleService.formules().subscribe((formules) => {
      this.formules = formules;
    });
  }
}
