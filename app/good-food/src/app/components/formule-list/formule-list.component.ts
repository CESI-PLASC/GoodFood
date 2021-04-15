import { Input } from '@angular/core';
import { Component, Output, EventEmitter } from '@angular/core';
import { Subject } from 'rxjs';
import { PanierService } from 'src/app/pages/catalogue-page/services/panier.service';
import { Icons } from 'src/app/shared/constants/icons.constant';
import { IFormule, IFormuleWithProducts } from 'src/app/shared/models/formule/formule';
import { IProduit } from 'src/app/shared/models/produit/produit';

@Component({
  selector: 'gf-formule-list',
  templateUrl: './formule-list.component.html',
  styleUrls: ['./formule-list.component.scss']
})

export class FormuleListComponent {

  formuleSelectionnee: IFormule;
  tableauFormules: IFormule[] = [];
  prixTotal: number;
  activateFormule: IFormuleWithProducts;
  indexFormuleSelectionnee: number;
  tableauProduitsSubject: Subject<IProduit[]> = new Subject<IProduit[]>();
  public icons = Icons;
  public collapsedList: boolean[] = [];

  @Input() public formules: IFormule[];
  @Output() public formuleSelected: EventEmitter<any> = new EventEmitter<any>();
  @Output() public idFormuleSelected: EventEmitter<any> = new EventEmitter<any>();


  constructor(public panierService: PanierService) { }

  ajouterFormule(): void{
    this.panierService.addFormule(this.formuleSelectionnee);
    this.indexFormuleSelectionnee = this.panierService.formulesWithProducts.length - 1;
    this.activateFormule = this.panierService.formulesWithProducts[this.indexFormuleSelectionnee];

    this.formuleSelected.emit(this.panierService.formulesWithProducts);
  }

  voirDetailsFormule(id: number): void{
    alert(`Composition de la formule ${id}`);
  }

  retirerFormule(index: number): void{
    if (confirm('Voulez-vous retirer cette formule de votre panier ?')) {
      this.panierService.removeFormule(index);
    }
  }

  retirerProduit(index: number): void{
    this.panierService.removeProduit(index);
  }

  choisirFormule(indexFormule: number): void{
    this.panierService.selectFormule(indexFormule);
    this.activateFormule = this.panierService.formulesWithProducts[indexFormule];
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
