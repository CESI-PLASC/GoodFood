import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IFranchise } from 'src/app/shared/models/franchise';
import { Observable } from 'rxjs/internal/Observable';
import { CS_URL } from '../../../shared/constants/url.constant';

@Injectable({
  providedIn: 'root'
})
export class FranchiseService {
  private readonly ressourceUrl = `${CS_URL}/api/v1`;

  constructor(private readonly http: HttpClient) {}

  public getFranchises(): Observable<IFranchise[]>{
    return this.http.get<IFranchise[]>(`${this.ressourceUrl}/franchises`);
  }


}
