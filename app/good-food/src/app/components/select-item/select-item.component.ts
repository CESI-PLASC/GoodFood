import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Formule, IFormule } from '../../shared/models/formule';

@Component({
  selector: 'gf-select-item',
  templateUrl: './select-item.component.html',
  styleUrls: ['./select-item.component.scss']
})
export class SelectItemComponent implements OnInit {
    
  @Input() public formules: Formule[];
  @Input() public selectLabel: string = "Choisir une formule...";
  @Output() public itemSelected: EventEmitter<any> = new EventEmitter<any>();

  constructor() {
  }

  ngOnInit(): void {
    this.formules = [
      new Formule({
        id: 1,
        designation: 'Formule - Gourmande'
      }),
      new Formule({
        id: 2,
        designation: 'Formule - Classique'
      }),
      new Formule({
        id: 3,
        designation: 'Formule - Petit creux'
      })
    ];
  }

  getItem(item:any): void {
    this.itemSelected.emit(item);
    this.selectLabel = item.designation;
  }


}
