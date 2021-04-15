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
    if (this.formulesWithProducts.length == 0) {
      alert('Veuillez sélectionner une formule.');
    }
    else{
      this.formulesWithProducts[this.index].produits.push(produit);
    }
  }

  public removeProduit(indexProduit: number) {
    this.formulesWithProducts[this.index].produits.splice(indexProduit,1);
  }

  public addFormule(formule: IFormule){
    this.formulesWithProducts.push({...formule, produits:[]});
    this.index = this.formulesWithProducts.length - 1;
  }

  public removeFormule(indexFormule: number) {
    this.formulesWithProducts.splice(indexFormule,1);
  }

  public selectFormule(index: number){
    this.index = index;
  }

}
