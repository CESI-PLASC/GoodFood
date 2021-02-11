import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { JAVA_URL } from 'src/app/shared/constants/url.constant';
import { IPanier } from 'src/app/shared/models/panier';

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  private readonly resourceUrl = `${JAVA_URL}`;

  constructor(private readonly http: HttpClient) { }

  public getPanier(id: number): Observable<IPanier> {
    return this.http.get<IPanier>(`${this.resourceUrl}/commandes/${id}/panier`);
  }
}
