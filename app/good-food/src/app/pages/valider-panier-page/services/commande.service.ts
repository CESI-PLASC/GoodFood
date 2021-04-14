import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import { RESS_COMMANDES, RESS_PAIEMENTS } from 'src/app/shared/constants/ressources.contants';
import { Commande, CommandeArgs, ICommande } from 'src/app/shared/models/commande';
import Paiement, { PaiementArgs } from 'src/app/shared/models/paiement';

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  constructor(private readonly http: HttpClient) { }

  public getOne(idCommande: number): Observable<Commande>{
    return this.http.get<CommandeArgs>(`${RESS_COMMANDES}/${idCommande}`).pipe(map(reponse => new Commande(reponse)));
  }

  public payerCommande(idCommande: number): Observable<Paiement>{
    return this.http.get<PaiementArgs>(`${RESS_PAIEMENTS}/commandes/${idCommande}`).pipe(map(response => new Paiement(response)));
  }
}
