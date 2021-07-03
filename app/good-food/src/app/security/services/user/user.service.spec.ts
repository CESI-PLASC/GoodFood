import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { UserService } from './user.service';

describe('User service tests', () => {
    let spectator: SpectatorService<UserService>;
    const createService = createServiceFactory({
        service: UserService
    });

    beforeEach(() => spectator = createService());

    it('Shoud create service', () => expect(spectator.service).toBeDefined());
});
