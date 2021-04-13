import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Icons } from '../../shared/constants/icons.constant';
import { NgbDropdownConfig } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'gf-select-box',
  templateUrl: './select-box.component.html',
  styleUrls: ['./select-box.component.scss'],
  providers: [NgbDropdownConfig]
})
export class SelectBoxComponent {

  @Input() public items: any[] = [];
  @Input() public label = 'Choisir un item';
  @Input() public optionLabel: string;
  @Input() public selectedLabel: string;

  @Output() public itemChange: EventEmitter<any> = new EventEmitter<any>();

  public selectedItems: any[] = [];
  public checkedIcon = Icons.selectBox.checked;
  public uncheckedIcon = Icons.selectBox.unchecked;

  constructor(private config: NgbDropdownConfig) {
    config.autoClose = 'outside';
  }

  public selectItem(item: any): void {
    if (this.selectedItems.includes(item)) {
      this.selectedItems.splice(this.selectedItems.indexOf(item), 1);
    } else {
      this.selectedItems.push(item);
    }
    this.itemChange.emit(this.selectedItems);
  }

}
