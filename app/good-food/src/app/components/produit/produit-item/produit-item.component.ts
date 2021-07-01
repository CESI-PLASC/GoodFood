import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
import { PanierService } from 'src/app/pages/catalogue-page/services/panier.service';
import { AdministrationProduitsService } from 'src/app/pages/administration-produits-page/services/administration-produits.service';
import { Icons } from '../../../shared/constants/icons.constant';
import { IProduit, Produit } from '../../../shared/models/produit/produit';
import { ActivatedRoute, Router } from '@angular/router';

registerLocaleData(localeFr);

@Component({
  selector: 'gf-produit-item',
  templateUrl: './produit-item.component.html',
  styleUrls: ['./produit-item.component.scss'],
})
export class ProduitItemComponent implements OnInit {
  public readonly icons = Icons.produits;
  @Input() public produit: IProduit;
  public isAdministration = false;

  // Gestion du produit sélectionné
  @Output() produitSelected = new EventEmitter<Produit>();

  constructor(
    public panierService: PanierService,
    private readonly activatedRoute: ActivatedRoute,
    public adminProduitService: AdministrationProduitsService,
    public router: Router
  ) {}

  ngOnInit(): void {
    this.isAdministration =
      this.activatedRoute.snapshot?.data?.isAdministration;
  }

  public changerStatut(produit: IProduit): void {
    if (confirm('Voulez-vous changer le statut de ce produit ?')) {
      this.adminProduitService.deleteProduit(produit.id);
      let currentUrl = this.router.url;
      this.router.navigateByUrl('/', { skipLocationChange: true }).then(() => {
        this.router.navigate([currentUrl]);
        console.log(currentUrl);
      });
    }
  }
}
