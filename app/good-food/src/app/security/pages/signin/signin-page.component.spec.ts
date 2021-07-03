import { createComponentFactory, Spectator } from '@ngneat/spectator/jest';
import { SigninPageComponent } from './signin-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { RouterTestingModule } from '@angular/router/testing';

describe('Signin page tests', () => {
    let spectator: Spectator<SigninPageComponent>;
    const createComponent = createComponentFactory({
        component: SigninPageComponent,
        imports: [
            FormsModule,
            ReactiveFormsModule,
            HttpClientTestingModule,
            RouterTestingModule,
        ]
    });

    beforeEach(() => spectator = createComponent());

    it('Shoud create component', () => expect(spectator.component).toBeDefined());
});
