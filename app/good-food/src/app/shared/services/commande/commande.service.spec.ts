import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { CommandeService } from './commande.service';

describe('CommandeService tests', () => {
  let spectator: SpectatorService<CommandeService>;
  const createService = createServiceFactory({
    service: CommandeService,
    imports: [
      HttpClientTestingModule,
    ]
  });

  beforeEach(() => spectator = createService());

  it('Should be created', () => {
    expect(spectator.service).toBeDefined();
  });
});
