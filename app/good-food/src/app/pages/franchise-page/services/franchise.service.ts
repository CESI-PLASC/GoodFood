import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { observable } from 'rxjs';
import { IFranchise } from 'src/app/shared/models/franchise';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class FranchiseService {
  private readonly ressourceUrl = `https://localhost:5001/api/v1`
  constructor(private readonly http:HttpClient) {}

  getFranchises():Observable<IFranchise[]>{
    return this.http.get<IFranchise[]>(`${this.ressourceUrl}/franchises`);
  }


}
