import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { TokenService } from './token.service';

describe('Token service tests', () => {
    let spectator: SpectatorService<TokenService>;
    const createService = createServiceFactory({
        service: TokenService
    });

    beforeEach(() => spectator = createService());

    it('Shoud create service', () => expect(spectator.service).toBeDefined());
});
