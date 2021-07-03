import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { AuthService } from './auth.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('Auth service tests', () => {
    let spectator: SpectatorService<AuthService>;
    const createService = createServiceFactory({
        service: AuthService,
        imports: [
            HttpClientTestingModule,
        ]
    });

    beforeEach(() => spectator = createService());

    it('Shoud create service', () => expect(spectator.service).toBeDefined());
});
