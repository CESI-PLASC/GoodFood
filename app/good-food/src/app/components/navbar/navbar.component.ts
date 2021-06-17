import { Component, OnInit } from '@angular/core';
import { faBars } from '@fortawesome/free-solid-svg-icons/faBars';
import { UserService } from '../../security/services/user/user.service';
import { User } from '../../security/models/user.model';
import { AuthService } from '../../security/services/auth/auth.service';

@Component({
  selector: 'gf-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {
  public barreIcon = faBars;
  public isMenuCollapsed = true;

  public user: User;

  constructor(private readonly userService: UserService, private readonly authService: AuthService) {
    this.userService.$userChange.subscribe(user => this.user = user);
  }

  ngOnInit(): void {
    this.user = this.userService.currentUser;
  }

  public signout(): void {
    this.authService.signout();
  }
}
