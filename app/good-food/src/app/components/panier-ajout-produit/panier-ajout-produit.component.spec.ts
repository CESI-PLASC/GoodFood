import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PanierAjoutProduitComponent } from './panier-ajout-produit.component';

describe('PanierAjoutProduitComponent', () => {
  let component: PanierAjoutProduitComponent;
  let fixture: ComponentFixture<PanierAjoutProduitComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PanierAjoutProduitComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PanierAjoutProduitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
