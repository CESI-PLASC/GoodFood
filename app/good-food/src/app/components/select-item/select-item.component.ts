import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Formule } from '../../shared/models/formule/formule';

@Component({
  selector: 'gf-select-item',
  templateUrl: './select-item.component.html',
  styleUrls: ['./select-item.component.scss']
})
export class SelectItemComponent {

  @Input() public formules: Formule[];
  @Input() public selectLabel = 'Choisir une formule...';
  @Output() public itemSelected: EventEmitter<any> = new EventEmitter<any>();

  getItem(item: any): void {
    this.itemSelected.emit(item);
    this.selectLabel = item.designation;
  }


}
