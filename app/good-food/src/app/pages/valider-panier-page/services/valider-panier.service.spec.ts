import { createServiceFactory, SpectatorService } from '@ngneat/spectator/jest';
import { HttpClientModule } from '@angular/common/http';
import { ValiderPanierService } from './valider-panier.service';

describe('Commande service tests', () => {
  let spectator: SpectatorService<ValiderPanierService>;
  const createService = createServiceFactory({
    service: ValiderPanierService,
    imports: [HttpClientModule],
  });

  let service: ValiderPanierService;

  beforeEach(() => {
    spectator = createService();
    service = spectator.service;
  });

  it('Should init service', () => expect(service).toBeDefined());
});
