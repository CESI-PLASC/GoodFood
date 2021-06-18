import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientModule } from '@angular/common/http';
import { AdministrationFormulesService } from './administration-formules.service';

describe('Administration formules service tests', () => {
  let spectator: SpectatorService<AdministrationFormulesService>;
  const createService = createServiceFactory({
    service: AdministrationFormulesService,
    imports: [
      HttpClientModule
    ],
  });

  let service: AdministrationFormulesService;

  beforeEach(() => {
    spectator = createService();
    service = spectator.service;
  });

  it('Should init service', () => expect(service).toBeDefined());
});
