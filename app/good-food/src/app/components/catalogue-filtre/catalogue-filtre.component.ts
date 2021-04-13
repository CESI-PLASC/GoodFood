import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ISimpleCategorie, SimpleCategorie } from '../../shared/models/categorie';

@Component({
  selector: 'gf-catalogue-filtre',
  templateUrl: './catalogue-filtre.component.html',
  styleUrls: ['./catalogue-filtre.component.scss']
})
export class CatalogueFiltreComponent {
  @Input() public filters: ISimpleCategorie[] = [];

  @Output() public filterChange: EventEmitter<ISimpleCategorie[]> = new EventEmitter<ISimpleCategorie[]>();

  constructor() { }

  ngOnInit(): void {
    //console.log(this.filters);
    this.filters.push(new SimpleCategorie({
      id: 3,
      designation: 'Entrées'
    }));
    this.filters.push(new SimpleCategorie({
      id: 4,
      designation: 'Boissons'
    }));
  }

}
