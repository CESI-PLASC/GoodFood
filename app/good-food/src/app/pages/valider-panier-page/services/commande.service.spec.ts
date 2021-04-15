import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientModule } from '@angular/common/http';
import { CommandeService } from './commande.service';

describe('Commande service tests', () => {
  let spectator: SpectatorService<CommandeService>;
  const createService = createServiceFactory({
    service: CommandeService,
    imports: [
      HttpClientModule
    ],
  });

  let service: CommandeService;

  beforeEach(() => {
    spectator = createService();
    service = spectator.service;
  });

  it('Should init service', () => expect(service).toBeDefined());
});
