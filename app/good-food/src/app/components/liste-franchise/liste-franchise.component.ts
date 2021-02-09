import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-liste-franchise',
  templateUrl: './liste-franchise.component.html',
  styleUrls: ['./liste-franchise.component.scss']
})

export class ListeFranchiseComponent implements OnInit {

  @Input() listefranchise:any[] = [];

  constructor() { }

  ngOnInit(): void {
    
  }



}
