import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeFranchiseComponent } from './liste-franchise.component';

describe('ListeFranchiseComponent', () => {
  let component: ListeFranchiseComponent;
  let fixture: ComponentFixture<ListeFranchiseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeFranchiseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeFranchiseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
