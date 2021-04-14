import { Injectable } from '@angular/core';
import { IProduit } from 'src/app/shared/models/produit';
import { IFormule, IFormuleWithProducts } from '../../../shared/models/formule';

@Injectable({
  providedIn: 'root'
})
export class PanierService {

  public formulesWithProducts : IFormuleWithProducts[] = [];
  public index: number;

  public addProduit(produit: IProduit) {
    this.formulesWithProducts[this.index].produits.push(produit);
  }

  public addFormule(formule: IFormule){
    this.formulesWithProducts.push({...formule, produits:[]});
    this.index = this.formulesWithProducts.length - 1;
  }

  public selectFormule(index: number){
    this.index = index;
  }

}
