import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FiltreFranchiseComponent } from './filtre-franchise.component';

describe('FiltreFranchiseComponent', () => {
  let component: FiltreFranchiseComponent;
  let fixture: ComponentFixture<FiltreFranchiseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FiltreFranchiseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FiltreFranchiseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
