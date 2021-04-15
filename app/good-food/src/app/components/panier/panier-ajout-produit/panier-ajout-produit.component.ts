import { Component, OnInit } from '@angular/core';
import { CatalogueService } from 'src/app/pages/catalogue-page/services/catalogue.service';
// TODO same later
import { IFormule, IFormuleWithProducts } from 'src/app/shared/models/formule/formule';

@Component({
  selector: 'gf-panier-ajout-produit',
  templateUrl: './panier-ajout-produit.component.html',
  styleUrls: ['./panier-ajout-produit.component.scss']
})
export class PanierAjoutProduitComponent implements OnInit {

  public formules: IFormule[] = [];
  prixTotal = 0.00;

  constructor(private readonly catalogueService: CatalogueService) { }

  ngOnInit(): void {
    this.catalogueService.getFormules().subscribe(res => {
      this.formules = res;
    });
  }

  actualiseTotal(formule: IFormuleWithProducts[]): void{
    this.prixTotal = 0.00;
    formule.forEach(element => {
      this.prixTotal += element.prix;
    });
  }
}
