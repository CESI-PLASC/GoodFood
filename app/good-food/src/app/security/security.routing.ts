import { Routes } from '@angular/router';
import { SigninPageComponent } from './pages/signin/signin-page.component';
import { AlreadyAuthGuard } from './guards/already-auth.guard';

export const securityRoutes: Routes = [
    {
        path: 'signin',
        component: SigninPageComponent,
        pathMatch: 'full',
        canActivate: [AlreadyAuthGuard]
    }
];
