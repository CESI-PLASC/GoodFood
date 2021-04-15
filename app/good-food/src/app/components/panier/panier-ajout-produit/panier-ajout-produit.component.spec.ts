import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { PanierAjoutProduitComponent } from './panier-ajout-produit.component';
import { NgbCollapseModule, NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';
import { FormuleListComponent } from '../../formule-list/formule-list.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { SelectItemComponent } from '../../select-item/select-item.component';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Panier ajout produit component tests', () => {
  let spectator: Spectator<PanierAjoutProduitComponent>;
  let comp: PanierAjoutProduitComponent;
  const createComponent = createComponentFactory({
    component: PanierAjoutProduitComponent,
    imports: [
      FontAwesomeTestingModule,
        NgbCollapseModule,
        NgbDropdownModule
    ],
    entryComponents: [
        FormuleListComponent,
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
