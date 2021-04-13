import { Component, Input, OnInit } from '@angular/core';
import { CatalogueService } from 'src/app/pages/catalogue-page/services/catalogue.service';
import { Formule, IFormule } from 'src/app/shared/models/formule';
import { Franchise } from 'src/app/shared/models/franchise';
import { IProduit } from 'src/app/shared/models/produit';

@Component({
  selector: 'gf-panier-ajout-produit',
  templateUrl: './panier-ajout-produit.component.html',
  styleUrls: ['./panier-ajout-produit.component.scss']
})
export class PanierAjoutProduitComponent implements OnInit {

  @Input() public produitChoisi: IProduit;

  public formules: IFormule[] = [];
  infosFormule: Formule;
  listFormule: Formule[] = [];
  prixTotal: number = 0.00;

  constructor(private readonly catalogueService: CatalogueService) { }

  ngOnInit(): void {
    this.catalogueService.getFormules().subscribe(res => {
      this.formules = res;
    });
  }

  actualiseTotal(formule: Formule[]): void{
    this.listFormule = formule;
    this.prixTotal = 0.00;
    formule.forEach(element => {
      this.prixTotal += element.prix;
    });
  }
}
