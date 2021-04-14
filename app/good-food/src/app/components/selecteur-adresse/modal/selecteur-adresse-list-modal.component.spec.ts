import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelecteurAdresseListModalComponent } from './selecteur-adresse-list-modal.component';

describe('SelecteurAdresseListModalComponent', () => {
  let component: SelecteurAdresseListModalComponent;
  let fixture: ComponentFixture<SelecteurAdresseListModalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelecteurAdresseListModalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SelecteurAdresseListModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
