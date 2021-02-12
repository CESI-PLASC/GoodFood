import { Component, Input, OnInit } from '@angular/core';
import { FranchiseService } from 'src/app/pages/franchise-page/services/franchise.service';
import { Franchise } from 'src/app/shared/models/franchise';

@Component({
  selector: 'gf-liste-franchise',
  templateUrl: './liste-franchise.component.html',
  styleUrls: ['./liste-franchise.component.scss']
})

export class ListeFranchiseComponent implements OnInit {

  @Input() franchises:Franchise[] = [

    //new Franchise({id:1,name:"LePrems",tel:"0652153615",mail:"restaurant@goodfood.fr",adresse:"12 rue des fleurs",img:"https://image.freepik.com/vecteurs-libre/restaurant-logo-modele_1236-155.jpg"}),
   // new Franchise({id:2,name:"Deuxieme",tel:"0785124596",mail:"restaurant@goodfood.fr",adresse:"12 rue des fleurs",img:"https://image.freepik.com/vecteurs-libre/restaurant-logo-modele_1236-155.jpg"}),
   // new Franchise({id:3,name:"Troisieme",tel:"0685236598",mail:"restaurant@goodfood.fr",adresse:"12 rue des fleurs",img:"https://image.freepik.com/vecteurs-libre/restaurant-logo-modele_1236-155.jpg"}),
   // new Franchise({id:4,name:"Quatre",tel:"0452369874",mail:"restaurant@goodfood.fr",adresse:"12 rue des fleurs",img:"https://image.freepik.com/vecteurs-libre/restaurant-logo-modele_1236-155.jpg"}),
   // new Franchise({id:5,name:"Last",tel:"0685363399",mail:"restaurant@goodfood.fr",adresse:"12 rue des fleurs",img:"https://image.freepik.com/vecteurs-libre/restaurant-logo-modele_1236-155.jpg"}),
];

  constructor(private readonly franchiseService:FranchiseService) { }

  ngOnInit(): void {
    this.franchiseService.getFranchises().subscribe(result=>this.franchises = result);
  }



}
