import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import { RESS_COMMANDES } from 'src/app/shared/constants/ressources.contants';
import { Commande, ICommande } from 'src/app/shared/models/commande';
import { IPanier } from 'src/app/shared/models/panier';

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  constructor(private readonly http: HttpClient) { }

  public getOne(idCommande: number): Observable<Commande>{
    return this.http.get<Commande>(`${RESS_COMMANDES}/${idCommande}`).pipe(map(reponse => new Commande(reponse)));
  }
}
