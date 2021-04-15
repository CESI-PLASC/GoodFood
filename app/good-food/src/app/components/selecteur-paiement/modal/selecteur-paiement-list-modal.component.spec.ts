import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelecteurPaiementListModalComponent } from './selecteur-paiement-list-modal.component';

describe('SelecteurPaiementListModalComponent', () => {
  let component: SelecteurPaiementListModalComponent;
  let fixture: ComponentFixture<SelecteurPaiementListModalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelecteurPaiementListModalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SelecteurPaiementListModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
