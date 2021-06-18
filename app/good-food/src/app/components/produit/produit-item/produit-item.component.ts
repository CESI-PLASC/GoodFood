import { Component, Input, OnInit } from '@angular/core';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
import { PanierService } from 'src/app/pages/catalogue-page/services/panier.service';
import { AdministrationProduitsService } from 'src/app/pages/administration-produits-page/services/administration-produits.service';
import { Icons } from '../../../shared/constants/icons.constant';
import { IProduit } from '../../../shared/models/produit/produit';
import { ActivatedRoute } from '@angular/router';

registerLocaleData(localeFr);

@Component({
  selector: 'gf-produit-item',
  templateUrl: './produit-item.component.html',
  styleUrls: ['./produit-item.component.scss']
})
export class ProduitItemComponent implements OnInit{
  public readonly icons = Icons.produits;
  @Input() public produit: IProduit;
  public isAdministration = false;

  constructor(public panierService: PanierService, private readonly activatedRoute: ActivatedRoute, public adminProduitService: AdministrationProduitsService) {}
  ngOnInit(): void {
    this.isAdministration = this.activatedRoute.snapshot?.data?.isAdministration;
  }

  ajouterProduitPanier(item: IProduit) : void{
    this.panierService.addProduit(item);
  }

  public supprimerProduit(produit: IProduit): void {
    if (confirm('Voulez-vous retirer ce produit de votre catalogue ?')) {
      this.adminProduitService.deleteProduit(produit.id);
    }
  }

}
