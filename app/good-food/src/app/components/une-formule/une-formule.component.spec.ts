import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UneFormuleComponent } from './une-formule.component';

describe('UneFormuleComponent', () => {
  let component: UneFormuleComponent;
  let fixture: ComponentFixture<UneFormuleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UneFormuleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UneFormuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
