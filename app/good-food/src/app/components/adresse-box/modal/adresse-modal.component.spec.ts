import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdresseModalComponent } from './adresse-modal.component';

describe('AdresseModalComponent', () => {
  let component: AdresseModalComponent;
  let fixture: ComponentFixture<AdresseModalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdresseModalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdresseModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
