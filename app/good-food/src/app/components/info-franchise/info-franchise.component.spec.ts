import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoFranchiseComponent } from './info-franchise.component';

describe('InfoFranchiseComponent', () => {
  let component: InfoFranchiseComponent;
  let fixture: ComponentFixture<InfoFranchiseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfoFranchiseComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoFranchiseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
