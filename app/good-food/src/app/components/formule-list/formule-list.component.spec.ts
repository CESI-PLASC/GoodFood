import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FormuleListComponent } from './formule-list.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { SelectItemComponent } from '../select-item/select-item.component';
import { NgbCollapseModule, NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Accueil component tests', () => {
  let spectator: Spectator<FormuleListComponent>;
  let comp: FormuleListComponent;
  const createComponent = createComponentFactory({
    component: FormuleListComponent,
    imports: [
        FontAwesomeTestingModule,
        NgbDropdownModule,
        NgbCollapseModule
    ],
    entryComponents: [
        SelectItemComponent
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
