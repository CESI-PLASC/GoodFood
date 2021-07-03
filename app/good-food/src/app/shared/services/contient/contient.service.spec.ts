import { ContientService } from './contient.service';
import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('ContientService tests', () => {
  let spectator: SpectatorService<ContientService>;
  const createService = createServiceFactory({
    service: ContientService,
    imports: [
        HttpClientTestingModule,
    ]
  });

  beforeEach(() => spectator = createService());

  it('Should be created', () => {
    expect(spectator.service).toBeDefined();
  });
});
