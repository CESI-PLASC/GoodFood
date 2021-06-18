import { TestBed } from '@angular/core/testing';

import { ContientService } from './contient.service';

describe('ContientService', () => {
  let service: ContientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ContientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
