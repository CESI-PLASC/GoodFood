import { Injectable } from '@angular/core';

const TOKEN_KEY = 'auth-token';

@Injectable({
  providedIn: 'root'
})
export class TokenService {
  public getStoredToken(): string {
    return localStorage.getItem(TOKEN_KEY);
  }

  public setStoredToken(token: string): void {
    localStorage.setItem(TOKEN_KEY, token);
  }

  public clearStoredToken(): void {
    localStorage.removeItem(TOKEN_KEY);
  }
}
