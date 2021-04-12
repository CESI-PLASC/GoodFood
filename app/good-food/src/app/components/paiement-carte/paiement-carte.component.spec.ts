import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaiementCarteComponent } from './paiement-carte.component';

describe('PaiementCarteComponent', () => {
  let component: PaiementCarteComponent;
  let fixture: ComponentFixture<PaiementCarteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaiementCarteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PaiementCarteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
