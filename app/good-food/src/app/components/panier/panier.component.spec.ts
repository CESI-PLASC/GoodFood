import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Commande } from 'src/app/shared/models/commande';

import { PanierComponent } from './panier.component';

describe('PanierComponent', () => {
  let component: PanierComponent;
  let fixture: ComponentFixture<PanierComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PanierComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PanierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it("aucunes formules", () => {
    component.commande = new Commande({formules: []});
    fixture.detectChanges()

    const panier = (fixture.nativeElement as HTMLDivElement).querySelector("gf-panier-contenu > div");
    expect(panier.textContent).toContain("Le panier est vide")
  })
});
