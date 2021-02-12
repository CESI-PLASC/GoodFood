import { Input } from '@angular/core';
import { Component, OnInit } from '@angular/core';
import { Franchise, IFranchise } from 'src/app/shared/models/franchise';

@Component({
  selector: 'app-info-franchise',
  templateUrl: './info-franchise.component.html',
  styleUrls: ['./info-franchise.component.scss']
})
export class InfoFranchiseComponent implements OnInit {
 
  @Input() public franchise: IFranchise;
  
  constructor() { }

  ngOnInit(): void {
    
  }

}
