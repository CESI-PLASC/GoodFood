import { ConditionalExpr } from '@angular/compiler';
import { Component, OnInit, Input, Output, EventEmitter, forwardRef, OnChanges, SimpleChanges } from '@angular/core';
import { ControlValueAccessor, NG_VALUE_ACCESSOR } from '@angular/forms';
import { Subject } from 'rxjs';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { Formule } from 'src/app/shared/models/formule';
import { IProduit, Produit } from 'src/app/shared/models/produit';

@Component({
  selector: 'gf-formule-list',
  templateUrl: './formule-list.component.html',
  styleUrls: ['./formule-list.component.scss'],
  providers: [{
    provide:NG_VALUE_ACCESSOR,
    useExisting: forwardRef(()=>FormuleListComponent),
    multi:true
  }]
})

export class FormuleListComponent implements OnInit, ControlValueAccessor, OnChanges {

  formuleSelectionnee: Formule;
  tableauFormules: Formule[] = [];
  prixTotal: number;
  tableauProduitsSubject: Subject<IProduit[]> = new Subject<IProduit[]>();
  public icons = Icons;
  public collapsedList: boolean[] = [];
  tabProduits: Produit[] = [];
  indexFormule: number;

  @Input() public produitSelected : IProduit;
  @Output() public formuleSelected: EventEmitter<any> = new EventEmitter<any>();
  @Output() public idFormuleSelected: EventEmitter<any> = new EventEmitter<any>();

  public onTouch = ()=>{};
  public onChange = (value:IProduit[])=>{};

  constructor() { }

  ngOnChanges(changes: SimpleChanges): void {
    if (changes.produitSelected.currentValue != undefined && this.indexFormule != undefined) {
      this.tabProduits.push(changes.produitSelected.currentValue);
    }
  }

  writeValue(obj: any): void {
    this.produitSelected = obj;
  }
  registerOnChange(fn: any): void {
    this.onChange = fn;
  }
  registerOnTouched(fn: any): void {
    this.onTouch = fn;
  }


  ngOnInit(): void {
  }

  ajouterFormule(): void{
    if (this.formuleSelectionnee === undefined) {
      alert("Veuillez choisir une formule.")
    }
    else{
      this.tableauFormules.push(this.formuleSelectionnee);
      this.formuleSelected.emit(this.tableauFormules);
    }
  }

  voirDetailsFormule(id:number): void{
    alert("Composition de la formule");
  }

  retirerFormule(index:number): void{
    if (confirm("Voulez-vous retirer cette formule de votre panier ?")) {
      this.tableauFormules.splice(index, 1);
      this.formuleSelected.emit(this.tableauFormules);
    }
  }

  retirerProduit(index:number): void{
    this.tabProduits.splice(index, 1);
  }

  choisirFormule(indexFormule:number): void{
    //this.idFormuleSelected.emit(indexFormule);
    this.indexFormule = indexFormule;
    console.log(indexFormule);
  }


}
