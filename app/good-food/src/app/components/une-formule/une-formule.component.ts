import { Component, Input, OnInit } from '@angular/core';

export type Formule = {
  designation: string;
  prix: number;
  produits: any[]
}

@Component({
  selector: 'app-une-formule',
  templateUrl: './une-formule.component.html',
  styleUrls: ['./une-formule.component.scss']
})
export class UneFormuleComponent implements OnInit {

  @Input() formule: Formule;

  constructor() { }

  ngOnInit(): void {
    console.log(this.formule);
  }

}
