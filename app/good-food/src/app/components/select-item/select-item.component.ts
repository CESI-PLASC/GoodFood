import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Formule, IFormule } from '../../shared/models/formule';

@Component({
  selector: 'gf-select-item',
  templateUrl: './select-item.component.html',
  styleUrls: ['./select-item.component.scss']
})
export class SelectItemComponent implements OnInit {

  @Input() public formules: IFormule[];
  @Input() public selectLabel: string = "Choisir une formule...";
  @Output() public itemSelected: EventEmitter<any> = new EventEmitter<any>();

  constructor() {
  }

  ngOnInit(): void {
    console.log(this.formules);
  }

  getItem(item:any): void {
    this.itemSelected.emit(item);
    this.selectLabel = item.designation;
  }


}
