import { Injectable } from '@angular/core';
import { User } from '../../models/user.model';
import { Subject } from 'rxjs';
import { Observable } from 'rxjs/internal/Observable';

const USER_KEY = 'auth-user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userSubject: Subject<User> = new Subject<User>();
  private user: User;

  public $userChange: Observable<User>;

  constructor() {
    this.$userChange = this.userSubject.asObservable();
  }

  public set currentUser(user: User) {
    localStorage.setItem(USER_KEY, JSON.stringify(user));
    this.user = user;
    this.userSubject.next(user);
  }

  public get currentUser(): User {
    if (this.user) {
      return this.user;
    }

    const storedUserStr = localStorage.getItem(USER_KEY);
    if (storedUserStr) {
      return new User({...JSON.parse(storedUserStr)});
    }

    return null;
  }

  public clearCurrentUser(): void {
    this.user = null;
    localStorage.removeItem(USER_KEY);
    this.userSubject.next(null);
  }
}
