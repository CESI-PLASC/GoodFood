import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ISimpleCategorie } from '../../shared/models/categorie';

@Component({
  selector: 'gf-catalogue-filtre',
  templateUrl: './catalogue-filtre.component.html',
  styleUrls: ['./catalogue-filtre.component.scss']
})
export class CatalogueFiltreComponent implements OnInit {

  @Input() public filters: ISimpleCategorie[] = [];

  @Output() public filterChange: EventEmitter<ISimpleCategorie[]> = new EventEmitter<ISimpleCategorie[]>();

  public selectedFilters: ISimpleCategorie[] = [];

  constructor() { }

  ngOnInit(): void {
    console.log(this.filters)
  }

  public sendFilters(): void {
    this.filterChange.emit(this.selectedFilters);
  }

}
