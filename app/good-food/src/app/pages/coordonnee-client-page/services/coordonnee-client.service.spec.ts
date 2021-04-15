import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientModule } from '@angular/common/http';
import { CoordonneeClientService } from './coordonnee-client.service';

describe('Coordonnee client service tests', () => {
  let spectator: SpectatorService<CoordonneeClientService>;
  const createService = createServiceFactory({
    service: CoordonneeClientService,
    imports: [
      HttpClientModule
    ],
  });

  let service: CoordonneeClientService;

  beforeEach(() => {
    spectator = createService();
    service = spectator.service;
  });

  it('Should init service', () => expect(service).toBeDefined());
});
