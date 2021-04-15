import { Injectable } from '@angular/core';
import { IFormule, IFormuleWithProducts } from '../../../shared/models/formule/formule';
import { IProduit } from '../../../shared/models/produit/produit';

@Injectable({
  providedIn: 'root'
})
export class PanierService {

  public formulesWithProducts : IFormuleWithProducts[] = [];
  public index: number;

  public addProduit(produit: IProduit): void {
    if (this.formulesWithProducts.length === 0) {
      alert('Veuillez sélectionner une formule.');
    }
    else{
      this.formulesWithProducts[this.index].produits.push(produit);
    }
  }

  public removeProduit(indexProduit: number): void {
    this.formulesWithProducts[this.index].produits.splice(indexProduit, 1);
  }

  public addFormule(formule: IFormule): void {
    this.formulesWithProducts.push({...formule, produits: []});
    this.index = this.formulesWithProducts.length - 1;
  }

  public removeFormule(indexFormule: number): void {
    this.formulesWithProducts.splice(indexFormule, 1);
  }

  public selectFormule(index: number): void {
    this.index = index;
  }

}
