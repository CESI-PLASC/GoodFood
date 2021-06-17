import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { map } from 'rxjs/operators';
import { CS_URL } from '../../../shared/constants/url.constant';
import { UserResponse } from '../../models/user.response';
import { User } from '../../models/user.model';
import { TokenService } from '../token/token.service';
import { UserService } from '../user/user.service';

interface ICredential {
  email: string;
  password: string;
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private readonly http: HttpClient, private readonly tokenService: TokenService, private readonly userService: UserService) {}

  public signin(credential: ICredential): Observable<User>{
    return this.http.post<UserResponse>(`${CS_URL}/auth/signin`, credential).pipe(map((result: UserResponse) => {
      this.tokenService.setStoredToken(result.token);
      this.userService.currentUser = result.user;
      return result.user;
    }));
  }

  public signout(): void {
    this.tokenService.clearStoredToken();
    this.userService.clearCurrentUser();
  }

  public isAuth(): boolean {
    return !!this.tokenService.getStoredToken();
  }
}
