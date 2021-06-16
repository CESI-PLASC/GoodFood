import { Component, Input, EventEmitter, Output, OnInit} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ISimpleProduit, IProduit } from '../../../shared/models/produit/produit';

@Component({
  selector: 'gf-produit-list',
  templateUrl: './produit-list.component.html',
  styleUrls: ['./produit-list.component.scss']
})
export class ProduitListComponent implements OnInit{
  @Input() public produits: ISimpleProduit[];
  produit: ISimpleProduit;
  @Output() public produitSelected: EventEmitter<any> = new EventEmitter<any>();

  public isAdministration = false;

  constructor(private readonly activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.isAdministration = this.activatedRoute.snapshot?.data?.isAdministration;
  }

  recupProduitSelected(item: IProduit): void{
    this.produitSelected.emit(item);
  }
}
