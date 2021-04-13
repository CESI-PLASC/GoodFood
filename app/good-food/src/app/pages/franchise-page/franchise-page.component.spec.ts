import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FranchisePageComponent } from './franchise-page.component';

describe('FranchisePageComponent', () => {
  let component: FranchisePageComponent;
  let fixture: ComponentFixture<FranchisePageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FranchisePageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FranchisePageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
