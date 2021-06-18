import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { RESS_COMMANDES } from '../../constants/ressources.contants';
import {
  Commande,
  CommandeArgs,
  CommandeCreer,
} from '../../models/commande/commande';

@Injectable({
  providedIn: 'root',
})
export class CommandeService {
  constructor(private readonly http: HttpClient) {}

  public getOne(idCommande: number): Observable<Commande> {
    return this.http
      .get<CommandeArgs>(`${RESS_COMMANDES}/${idCommande}`)
      .pipe(map((reponse) => new Commande(reponse)));
  }

  public creer(commande: CommandeCreer): Observable<Commande> {
    return this.http
      .post<CommandeArgs>(RESS_COMMANDES, {
        dateCreation: commande.dateCreation,
        franchise: {
          id: commande.franchiseId,
        },
        statut: {
          id: commande.statutId,
        },
        utilisateur: {
          id: commande.utilisateurId,
        },
      })
      .pipe(map((reponse) => new Commande(reponse)));
  }
}
