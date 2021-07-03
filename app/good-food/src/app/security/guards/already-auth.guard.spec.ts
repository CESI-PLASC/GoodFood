import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { AlreadyAuthGuard } from './already-auth.guard';

describe('AlreadyAuthGuard tests', () => {
  let spectator: SpectatorService<AlreadyAuthGuard>;
  const createGuardService = createServiceFactory({
    service: AlreadyAuthGuard,
    imports: [
      RouterTestingModule,
      HttpClientTestingModule,
    ]
  });

  beforeEach(() => spectator = createGuardService());

  it('Should create guard', () => expect(spectator.service).toBeDefined());
});
