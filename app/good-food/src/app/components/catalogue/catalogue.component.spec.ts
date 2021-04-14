import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { CatalogueComponent } from './catalogue.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { NgbCollapseModule } from '@ng-bootstrap/ng-bootstrap';
import { CatalogueFiltreComponent } from '../catalogue-filtre/catalogue-filtre.component';
import { SelectBoxComponent } from '../select-box/select-box.component';
import { ProduitListComponent } from '../produit-list/produit-list.component';
import { ProduitItemComponent } from '../produit-item/produit-item.component';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Catalogue component tests', () => {
  let spectator: Spectator<CatalogueComponent>;
  let comp: CatalogueComponent;
  const createComponent = createComponentFactory({
    component: CatalogueComponent,
    imports: [
        FontAwesomeTestingModule,
        NgbCollapseModule
    ],
    entryComponents: [
        CatalogueFiltreComponent,
        SelectBoxComponent,
        ProduitListComponent,
        ProduitItemComponent
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
