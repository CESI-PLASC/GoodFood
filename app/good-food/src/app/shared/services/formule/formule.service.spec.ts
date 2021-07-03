import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { FormuleService } from './formule.service';

describe('FormuleService tests', () => {
  let spectator: SpectatorService<FormuleService>;
  const createService = createServiceFactory({
    service: FormuleService,
    imports: [
      HttpClientTestingModule,
    ]
  });

  beforeEach(() => spectator = createService());

  it('Should be created', () => {
    expect(spectator.service).toBeDefined();
  });
});
