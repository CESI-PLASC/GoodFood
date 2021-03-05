import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { RESS_COMMANDES } from 'src/app/shared/constants/ressources.contants';
import { ICommande } from 'src/app/shared/models/commande';
import { IPanier } from 'src/app/shared/models/panier';

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  constructor(private readonly http: HttpClient) { }

  public getPanier(idCommande: number): Observable<IPanier> {
    return this.http.get<IPanier>(`${RESS_COMMANDES}/${idCommande}/panier`);
  }

  public getOne(idCommande: number): Observable<ICommande>{
    return this.http.get<ICommande>(`${RESS_COMMANDES}/${idCommande}`);
  }
}
