import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoAdresseComponent } from './info-adresse.component';

describe('InfoAdresseComponent', () => {
  let component: InfoAdresseComponent;
  let fixture: ComponentFixture<InfoAdresseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfoAdresseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoAdresseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
