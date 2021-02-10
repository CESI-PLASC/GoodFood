import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ValiderPanierPageComponent } from './valider-panier-page.component';

describe('ValiderPanierPageComponent', () => {
  let component: ValiderPanierPageComponent;
  let fixture: ComponentFixture<ValiderPanierPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ValiderPanierPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ValiderPanierPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
