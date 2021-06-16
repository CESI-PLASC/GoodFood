import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientModule } from '@angular/common/http';
import { AdministrationService } from './administration.service';

describe('Administration service tests', () => {
  let spectator: SpectatorService<AdministrationService>;
  const createService = createServiceFactory({
    service: AdministrationService,
    imports: [
      HttpClientModule
    ],
  });

  let service: AdministrationService;

  beforeEach(() => {
    spectator = createService();
    service = spectator.service;
  });

  it('Should init service', () => expect(service).toBeDefined());
});
