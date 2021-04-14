import { TestBed } from '@angular/core/testing';

import { CoordonneeClientService } from './coordonnee-client.service';

describe('CoordonneeClientService', () => {
  let service: CoordonneeClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CoordonneeClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
