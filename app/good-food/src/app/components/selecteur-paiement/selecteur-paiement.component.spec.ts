import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelecteurPaiementComponent } from './selecteur-paiement.component';

describe('SelecteurPaiementComponent', () => {
  let component: SelecteurPaiementComponent;
  let fixture: ComponentFixture<SelecteurPaiementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelecteurPaiementComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SelecteurPaiementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
