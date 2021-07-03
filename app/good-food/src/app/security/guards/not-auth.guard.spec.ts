import { NotAuthGuard } from './not-auth.guard';
import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('NotAuthGuard tests', () => {
  let spectator: SpectatorService<NotAuthGuard>;
  const createGuardService = createServiceFactory({
    service: NotAuthGuard,
    imports: [
        RouterTestingModule,
        HttpClientTestingModule,
    ]
  });

  beforeEach(() => spectator = createGuardService());

  it('Should create guard', () => expect(spectator.service).toBeDefined());
});
