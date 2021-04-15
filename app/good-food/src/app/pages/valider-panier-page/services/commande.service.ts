import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import { RESS_COMMANDES, RESS_METHODES_PAIEMENT, RESS_PAIEMENTS } from 'src/app/shared/constants/ressources.contants';
import { Commande, CommandeArgs } from 'src/app/shared/models/commande';
import MethodePaiement, { MethodePaiementArgs } from 'src/app/shared/models/methode-paiement';

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  constructor(private readonly http: HttpClient) { }

  public getOne(idCommande: number): Observable<Commande>{
    return this.http.get<CommandeArgs>(`${RESS_COMMANDES}/${idCommande}`).pipe(map(reponse => new Commande(reponse)));
  }

  public methodesPaiementUtilisateur(idUtilisateur: number): Observable<MethodePaiement[]>{
    return this.http
      .get<MethodePaiementArgs[]>(`${RESS_METHODES_PAIEMENT}/utilisateurs/${idUtilisateur}`)
      .pipe(map(reponse => reponse.map((rep: MethodePaiementArgs) => new MethodePaiement(rep))))
    ;
  }

  // public payerCommande(idCommande: number): Observable<Paiement>{
  //   return this.http.get<PaiementArgs>(`${RESS_PAIEMENTS}/commandes/${idCommande}`).pipe(map(response => new Paiement(response)));
  // }
}
