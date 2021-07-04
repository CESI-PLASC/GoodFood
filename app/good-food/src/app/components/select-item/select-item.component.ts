import { Component, EventEmitter, Input, Output, OnInit } from '@angular/core';
import { AdministrationService } from 'src/app/pages/administration-page/services/administration.service';
import { IFormule } from 'src/app/shared/models/formule/formule';
import { Franchise } from 'src/app/shared/models/franchise/franchise';

@Component({
  selector: 'gf-select-item',
  templateUrl: './select-item.component.html',
  styleUrls: ['./select-item.component.scss']
})
export class SelectItemComponent implements OnInit {

  @Input() public franchise: Franchise;
  public formules: IFormule[] = [];
  @Input() public selectLabel = 'Choisir une formule...';
  @Output() public itemSelected: EventEmitter<any> = new EventEmitter<any>();

  constructor(
    private readonly administrationService: AdministrationService) { }

  ngOnInit(): void {
    this.administrationService.getFormulesByIdFranchise(this.franchise?.id).subscribe(result => this.formules = result);  
  }

  getItem(item: any): void {
    this.itemSelected.emit(item);
    this.selectLabel = item.designation;
  }
}
