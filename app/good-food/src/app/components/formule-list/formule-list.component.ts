import { Component, OnInit, Input, Output, EventEmitter, OnChanges, SimpleChanges } from '@angular/core';
import { Subject } from 'rxjs';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { Formule } from 'src/app/shared/models/formule/formule';
import { IProduit, Produit } from 'src/app/shared/models/produit/produit';

@Component({
  selector: 'gf-formule-list',
  templateUrl: './formule-list.component.html',
  styleUrls: ['./formule-list.component.scss']
})

export class FormuleListComponent implements OnInit, OnChanges {

  formuleSelectionnee: Formule;
  tableauFormules: Formule[] = [];
  prixTotal: number;
  tableauProduitsSubject: Subject<IProduit[]> = new Subject<IProduit[]>();
  public icons = Icons;
  public collapsedList: boolean[] = [];
  tabProduits: Produit[] = [];
  indexFormule: number;

  @Input() public produitChoisi : IProduit;
  @Output() public formuleSelected: EventEmitter<any> = new EventEmitter<any>();
  @Output() public idFormuleSelected: EventEmitter<any> = new EventEmitter<any>();

  public onTouch = () => {};
  public onChange = (_: IProduit[]) => {};

  constructor() { }

  ngOnChanges(changes: SimpleChanges): void {
    if (changes.produitChoisi.currentValue !== undefined && this.indexFormule !== undefined) {
      this.tabProduits.push(changes.produitChoisi.currentValue);
      this.produitChoisi = undefined;
    }
  }

  ngOnInit(): void {
  }

  ajouterFormule(): void{
    if (this.formuleSelectionnee === undefined) {
      alert('Veuillez choisir une formule.');
    }
    else{
      this.tableauFormules.push(this.formuleSelectionnee);
      this.formuleSelected.emit(this.tableauFormules);
    }
  }

  voirDetailsFormule(id: number): void{
    alert(`Composition de la formule ${id}`);
  }

  retirerFormule(index: number): void{
    if (confirm('Voulez-vous retirer cette formule de votre panier ?')) {
      this.tableauFormules.splice(index, 1);
      this.formuleSelected.emit(this.tableauFormules);
    }
  }

  retirerProduit(index: number): void{
    this.tabProduits.splice(index, 1);
  }

  choisirFormule(indexFormule: number): void{
    this.idFormuleSelected.emit(indexFormule);
    this.indexFormule = indexFormule;
    console.log(this.indexFormule);
  }


}
