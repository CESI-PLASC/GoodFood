import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MethodePaiementFormComponent } from './methode-paiement-form.component';

describe('MethodePaiementFormComponent', () => {
  let component: MethodePaiementFormComponent;
  let fixture: ComponentFixture<MethodePaiementFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MethodePaiementFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MethodePaiementFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
