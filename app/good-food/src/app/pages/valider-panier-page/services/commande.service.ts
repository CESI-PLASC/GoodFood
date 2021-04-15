import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import { RESS_COMMANDES, RESS_PAIEMENTS } from 'src/app/shared/constants/ressources.contants';
import { Commande, CommandeArgs } from 'src/app/shared/models/commande/commande';
import Paiement, { PaiementArgs } from 'src/app/shared/models/paiement/paiement';

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  constructor(private readonly http: HttpClient) { }

  public getOne(idCommande: number): Observable<Commande>{
    return this.http.get<CommandeArgs>(`${RESS_COMMANDES}/${idCommande}`).pipe(map(reponse => new Commande(reponse)));
  }

  public getPaiementIntent(idCommande: number): Observable<Paiement>{
    return this.http.get<PaiementArgs>(`${RESS_PAIEMENTS}/intent/${idCommande}`).pipe(map(response => new Paiement(response)));
  }
}
