import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FranchiseService } from 'src/app/pages/franchise-page/services/franchise.service';
import { Franchise } from 'src/app/shared/models/franchise/franchise';

@Component({
  selector: 'gf-administration-produits',
  templateUrl: './administration-produits.component.html',
  styleUrls: ['./administration-produits.component.scss']
})
export class AdministrationProduitsComponent implements OnInit{
  public franchise: Franchise;

  constructor(private readonly franchiseService: FranchiseService, private readonly route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.franchiseService.getFranchise(params.id).subscribe(result => this.franchise = result);
    });
  }
}
