import { Component, EventEmitter, Input, Output } from '@angular/core';
import { ISimpleCategorie } from '../../shared/models/categorie';

@Component({
  selector: 'gf-catalogue-filtre',
  templateUrl: './catalogue-filtre.component.html',
  styleUrls: ['./catalogue-filtre.component.scss']
})
export class CatalogueFiltreComponent {
  @Input() public filters: ISimpleCategorie[] = [];

  @Output() public filterChange: EventEmitter<ISimpleCategorie[]> = new EventEmitter<ISimpleCategorie[]>();
}
