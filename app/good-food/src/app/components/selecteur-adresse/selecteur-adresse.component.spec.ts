import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelecteurAdresseComponent } from './selecteur-adresse.component';

describe('SelecteurAdresseComponent', () => {
  let component: SelecteurAdresseComponent;
  let fixture: ComponentFixture<SelecteurAdresseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelecteurAdresseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SelecteurAdresseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
