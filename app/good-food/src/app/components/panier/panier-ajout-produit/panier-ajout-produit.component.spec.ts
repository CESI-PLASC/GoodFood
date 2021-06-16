import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { PanierAjoutProduitComponent } from './panier-ajout-produit.component';
import { NgbCollapseModule, NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';
import { FormuleListComponent } from '../../formule-list/formule-list.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { SelectItemComponent } from '../../select-item/select-item.component';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { LOCALE_ID } from '@angular/core';
import localeFr from '@angular/common/locales/fr';
import { registerLocaleData } from '@angular/common';
registerLocaleData(localeFr);

describe('Panier ajout produit component tests', () => {
  let spectator: Spectator<PanierAjoutProduitComponent>;
  let comp: PanierAjoutProduitComponent;
  const createComponent = createComponentFactory({
    component: PanierAjoutProduitComponent,
    imports: [
      FontAwesomeTestingModule,
        NgbCollapseModule,
        NgbDropdownModule,
        RouterTestingModule,
        HttpClientTestingModule
    ],
    providers: [ { provide: LOCALE_ID, useValue: 'FR' } ],
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
