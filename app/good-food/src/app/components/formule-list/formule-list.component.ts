import { Component, OnInit, Input, Output, EventEmitter, forwardRef } from '@angular/core';
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

export class FormuleListComponent implements OnInit, ControlValueAccessor {

  formuleSelectionnee: Formule;
  tableauFormules: Formule[] = [];
  prixTotal: number;
  tableauProduitsSubject: Subject<IProduit[]> = new Subject<IProduit[]>();
  public icons = Icons;
  public collapsedList: boolean[] = [];

  @Input() public produitsChoisis : IProduit[];
  @Output() public formuleSelected: EventEmitter<any> = new EventEmitter<any>();
  @Output() public prixTot: EventEmitter<any> = new EventEmitter<any>();

  public onTouch = ()=>{};
  public onChange = (value:IProduit[])=>{};

  constructor() { }

  writeValue(obj: any): void {
    this.produitsChoisis = obj;
  }
  registerOnChange(fn: any): void {
    this.onChange = fn;
  }
  registerOnTouched(fn: any): void {
    this.onTouch = fn;
  }


  ngOnInit(): void {
    this.formuleSelected.emit(this.tableauFormules);
  }

  ajouterFormule(): void{
    if (this.formuleSelectionnee === undefined) {
      alert("Veuillez choisir une formule.")
    }
    else{
      this.tableauFormules.push(this.formuleSelectionnee);
    }
  }

  voirDetailsFormule(id:number): void{
    alert("Composition de la formule");
  }

  retirerFormule(index:number): void{
    if (confirm("Voulez-vous retirer cette formule de votre panier ?")) {
      this.tableauFormules.splice(index, 1);
    }
  }

  retirerProduit(index:number): void{
    this.produitsChoisis.splice(index, 1);
  }


}
