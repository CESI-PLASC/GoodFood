import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoordonneeClientPageComponent } from './coordonnee-client-page.component';

describe('CoordonneeClientPageComponent', () => {
  let component: CoordonneeClientPageComponent;
  let fixture: ComponentFixture<CoordonneeClientPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CoordonneeClientPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CoordonneeClientPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
