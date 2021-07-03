import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CatalogueService } from 'src/app/pages/catalogue-page/services/catalogue.service';
import { FranchiseService } from 'src/app/pages/franchise-page/services/franchise.service';
import { AdministrationService } from 'src/app/pages/administration-page/services/administration.service';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { ICategorie } from 'src/app/shared/models/categorie/categorie';
import { IFormule } from 'src/app/shared/models/formule/formule';
import { Franchise } from 'src/app/shared/models/franchise/franchise';

@Component({
  selector: 'gf-administration',
  templateUrl: './administration.component.html',
  styleUrls: ['./administration.component.scss']
})
export class AdministrationComponent implements OnInit{
  public icons = Icons;
  public franchise: Franchise;
  public categories: ICategorie[] = [];
  public nbProduits = 0;
  public nbFormule = 0;
  public formules: IFormule[] = [];

  constructor(private readonly franchiseService: FranchiseService,
              private readonly route: ActivatedRoute,
              private readonly catalogueService: CatalogueService,
              private readonly administrationService: AdministrationService) { }

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.franchiseService.getFranchise(params.id).subscribe(result => this.franchise = result);
    });
    this.route.params.subscribe(params => {
      this.catalogueService.getByFranchiseId(params.id).subscribe(result => {
        this.categories = result;
        this.categories.forEach(element => this.nbProduits += element.produits.length);
      });
    });
    this.route.params.subscribe(params => {
      this.administrationService.getFormulesByIdFranchise(params.id).subscribe(result => {
        this.nbFormule = result.length;
      });
    });
  }
}
