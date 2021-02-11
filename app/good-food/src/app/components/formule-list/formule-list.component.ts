import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { Formule } from 'src/app/shared/models/formule';

@Component({
  selector: 'gf-formule-list',
  templateUrl: './formule-list.component.html',
  styleUrls: ['./formule-list.component.scss']
})
export class FormuleListComponent implements OnInit {

  formuleSelectionnee: Formule;
  tableauFormules: Formule[] = [];  
  public icons = Icons.catalogue;  
  public collapsedList: boolean[] = [];
  
  constructor() { }

  ngOnInit(): void {
  }  

  ajouterFormule(): void{
    this.tableauFormules.push(this.formuleSelectionnee);
  }

  voirDetailsFormule(id:number): void{
    alert("Composition de la formule");
  }
  

}
