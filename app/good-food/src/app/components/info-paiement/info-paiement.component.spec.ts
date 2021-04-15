import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoPaiementComponent } from './info-paiement.component';

describe('InfoPaiementComponent', () => {
  let component: InfoPaiementComponent;
  let fixture: ComponentFixture<InfoPaiementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfoPaiementComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoPaiementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
