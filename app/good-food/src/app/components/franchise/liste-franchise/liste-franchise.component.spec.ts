import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { ListeFranchiseComponent } from './liste-franchise.component';
import { InfoFranchiseComponent } from '../info-franchise/info-franchise.component';
import { FiltreFranchiseComponent } from '../filtre-franchise/filtre-franchise.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { MockComponent } from 'ng-mocks';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('Liste franchise component tests', () => {
  let spectator: Spectator<ListeFranchiseComponent>;
  let comp: ListeFranchiseComponent;
  const createComponent = createComponentFactory({
    component: ListeFranchiseComponent,
    imports: [
      FontAwesomeTestingModule,
      RouterTestingModule,
      HttpClientTestingModule
    ],
    declarations: [
      MockComponent(InfoFranchiseComponent),
      MockComponent(FiltreFranchiseComponent),
    ]
  });

  beforeEach(() => {
    spectator = createComponent();
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });
});
