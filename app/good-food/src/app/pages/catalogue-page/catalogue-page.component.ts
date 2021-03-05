import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Franchise, IFranchise } from '../../shared/models/franchise';
import { FranchiseService } from '../franchise-page/services/franchise.service';

@Component({
  selector: 'gf-catalogue-page',
  templateUrl: './catalogue-page.component.html',
  styleUrls: ['./catalogue-page.component.scss']
})
export class CataloguePageComponent implements OnInit{
  public franchise: Franchise;

  constructor(private route: ActivatedRoute, private readonly franchiseService: FranchiseService){}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.franchiseService.getFranchise(params.id).subscribe(franchise => {
        this.franchise = franchise;
      });
    })
  }
}
