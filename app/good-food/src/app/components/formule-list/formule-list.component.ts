import { Input } from '@angular/core';
import { Component, Output, EventEmitter } from '@angular/core';
import { Subject } from 'rxjs';
import { PanierService } from 'src/app/pages/catalogue-page/services/panier.service';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { Formule, IFormule } from 'src/app/shared/models/formule';
import { IProduit, Produit } from 'src/app/shared/models/produit';

@Component({
  selector: 'gf-formule-list',
  templateUrl: './formule-list.component.html',
  styleUrls: ['./formule-list.component.scss']
})

export class FormuleListComponent {

  formuleSelectionnee: IFormule;
  tableauFormules: Formule[] = [];
  prixTotal: number;
  tableauProduitsSubject: Subject<IProduit[]> = new Subject<IProduit[]>();
  public icons = Icons;
  public collapsedList: boolean[] = [];

  @Input() public formules: IFormule[];
  @Output() public formuleSelected: EventEmitter<any> = new EventEmitter<any>();
  @Output() public idFormuleSelected: EventEmitter<any> = new EventEmitter<any>();


  constructor(public panierService: PanierService) { }


  ajouterFormule(): void{
    this.panierService.addFormule(this.formuleSelectionnee);
  }

  voirDetailsFormule(id:number): void{
    alert("Composition de la formule");
  }

  retirerFormule(index:number): void{
    throw new Error("Todo");
    // if (confirm("Voulez-vous retirer cette formule de votre panier ?")) {
    //   this.tableauFormules.splice(index, 1);
    //   this.formuleSelected.emit(this.tableauFormules);
    // }
  }

  retirerProduit(index:number): void{
    throw new Error("Todo");
  }

  choisirFormule(indexFormule:number): void{
    this.panierService.selectFormule(indexFormule);
    console.log(this.panierService.formulesWithProducts);
  }

  /**
   * {
   *    'id' = 1,
   *    'designation' = 'gourmande',
   *    'prix' = 29.99,
   *    'compose' = {
   *        {
   *             'id' = 1,
   *             'nom' = soupe,
   *             'prix' = 9.99
   *        },
   *        {
   *             'id' = 2,
   *             'nom' = burger,
   *             'prix' = 14.99
   *        }
   *     }
   * }
   */

}
