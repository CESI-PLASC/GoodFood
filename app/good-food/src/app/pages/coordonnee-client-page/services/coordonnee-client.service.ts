import { Injectable } from '@angular/core';
import Utilisateur, { IUtilisateur } from '../../../shared/models/utilisateur/Utilisateur';

@Injectable({
  providedIn: 'root'
})
export class CoordonneeClientService {

  private utilisateur: IUtilisateur;

  public getUtilisateur(): IUtilisateur {
    return this.utilisateur;
  }

  public updateUtilisateur(value: IUtilisateur): void {
    this.utilisateur = new Utilisateur({ ...this.utilisateur, ...value });
    console.log(this.utilisateur);
  }
}
