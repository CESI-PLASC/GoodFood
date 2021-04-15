import { Component, Input, OnInit } from '@angular/core';
import { FranchiseService } from 'src/app/pages/franchise-page/services/franchise.service';
import { Franchise } from 'src/app/shared/models/franchise/franchise';

@Component({
  selector: 'gf-liste-franchise',
  templateUrl: './liste-franchise.component.html',
  styleUrls: ['./liste-franchise.component.scss']
})

export class ListeFranchiseComponent implements OnInit {
  @Input() franchises: Franchise[] = [];

  constructor(private readonly franchiseService: FranchiseService) { }

  ngOnInit(): void {
    this.franchiseService.getFranchises().subscribe(result => this.franchises = result);
  }
}
