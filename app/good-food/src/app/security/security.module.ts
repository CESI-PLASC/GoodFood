import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { securityRoutes } from './security.routing';
import { SigninPageComponent } from './pages/signin/signin-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
    declarations: [SigninPageComponent],
    imports: [
        CommonModule,
        RouterModule.forChild(securityRoutes),
        FormsModule,
        ReactiveFormsModule,
    ],
    exports: [
        RouterModule
    ]
})
export class SecurityModule { }
