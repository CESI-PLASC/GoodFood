import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientModule } from '@angular/common/http';
import { AdministrationProduitsService } from './administration-produits.service';

describe('Administration produits service tests', () => {
  let spectator: SpectatorService<AdministrationProduitsService>;
  const createService = createServiceFactory({
    service: AdministrationProduitsService,
    imports: [
      HttpClientModule
    ],
  });

  let service: AdministrationProduitsService;

  beforeEach(() => {
    spectator = createService();
    service = spectator.service;
  });

  it('Should init service', () => expect(service).toBeDefined());
});
