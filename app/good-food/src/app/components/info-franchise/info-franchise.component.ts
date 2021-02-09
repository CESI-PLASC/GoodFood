import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-info-franchise',
  templateUrl: './info-franchise.component.html',
  styleUrls: ['./info-franchise.component.scss']
})
export class InfoFranchiseComponent implements OnInit {
 
  franchise : Franchise;
  
  constructor() { }

  ngOnInit(): void {
  }

}
