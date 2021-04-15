import { CatalogueService } from './catalogue.service';
import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientModule } from '@angular/common/http';

describe('Catalogue service tests', () => {
  let spectator: SpectatorService<CatalogueService>;
  const createService = createServiceFactory({
    service: CatalogueService,
    imports: [
        HttpClientModule
    ],
  });

  let service: CatalogueService;

  beforeEach(() => {
    spectator = createService();
    service = spectator.service;
  });

  it('Should init service', () => expect(service).toBeDefined());
});
