import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { IProduit } from 'src/app/shared/models/produit/produit';
import { Franchise } from '../../shared/models/franchise/franchise';
import { FranchiseService } from '../franchise-page/services/franchise.service';

@Component({
  selector: 'gf-catalogue-page',
  templateUrl: './catalogue-page.component.html',
  styleUrls: ['./catalogue-page.component.scss']
})
export class CataloguePageComponent implements OnInit{
  public franchise: Franchise;
  produitSelected : IProduit;
  @Input() public produitChoisi: IProduit;

  constructor(private route: ActivatedRoute, private readonly franchiseService: FranchiseService){}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.franchiseService.getFranchise(params.id).subscribe(franchise => {
        this.franchise = franchise;
      });
    });
  }
}
