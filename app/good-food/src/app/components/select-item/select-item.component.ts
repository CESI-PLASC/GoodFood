import { Component, EventEmitter, Input, Output, OnInit } from '@angular/core';
import { Formule } from '../../shared/models/formule/formule';

@Component({
  selector: 'gf-select-item',
  templateUrl: './select-item.component.html',
  styleUrls: ['./select-item.component.scss']
})
export class SelectItemComponent implements OnInit {

  @Input() public formules: Formule[];
  @Input() public selectLabel = 'Choisir une formule...';
  @Output() public itemSelected: EventEmitter<any> = new EventEmitter<any>();

  ngOnInit(): void {
    console.log(this.formules);
  }

  getItem(item: any): void {
    this.itemSelected.emit(item);
    this.selectLabel = item.designation;
  }
}
