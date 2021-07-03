import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { ContenuService } from './contenu.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('ContenuService tests', () => {
  let spectator: SpectatorService<ContenuService>;
  const createService = createServiceFactory({
    service: ContenuService,
    imports: [
        HttpClientTestingModule,
    ]
  });

  beforeEach(() => spectator = createService());

  it('Should be created', () => {
    expect(spectator.service).toBeDefined();
  });
});
