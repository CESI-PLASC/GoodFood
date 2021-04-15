import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientModule } from '@angular/common/http';
import { FranchiseService } from './franchise.service';

describe('Franchise service tests', () => {
  let spectator: SpectatorService<FranchiseService>;
  const createService = createServiceFactory({
    service: FranchiseService,
    imports: [
      HttpClientModule
    ],
  });

  let service: FranchiseService;

  beforeEach(() => {
    spectator = createService();
    service = spectator.service;
  });

  it('Should init service', () => expect(service).toBeDefined());
});
