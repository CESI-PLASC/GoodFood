import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { CataloguePageComponent } from './catalogue-page.component';
import { PanierAjoutProduitComponent } from '../../components/panier/panier-ajout-produit/panier-ajout-produit.component';
import { CatalogueComponent } from '../../components/catalogue/catalogue.component';
import { CatalogueFiltreComponent } from '../../components/catalogue/catalogue-filtre/catalogue-filtre.component';
import { ProduitListComponent } from '../../components/produit/produit-list/produit-list.component';
import { ProduitItemComponent } from '../../components/produit/produit-item/produit-item.component';
import { NgbCollapseModule, NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { FormuleListComponent } from '../../components/formule-list/formule-list.component';
import { SelectBoxComponent } from '../../components/select-box/select-box.component';
import { SelectItemComponent } from '../../components/select-item/select-item.component';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('Catalogue page tests', () => {
  let spectator: Spectator<CataloguePageComponent>;
  let comp: CataloguePageComponent;
  const createComponent = createComponentFactory({
    component: CataloguePageComponent,
    imports: [
      NgbCollapseModule,
        NgbDropdownModule,
        FontAwesomeTestingModule,
        RouterTestingModule,
        HttpClientTestingModule
    ],
    entryComponents: [
        CatalogueComponent,
        PanierAjoutProduitComponent,
        CatalogueFiltreComponent,
        FormuleListComponent,
        ProduitItemComponent,
      ProduitListComponent,
        SelectBoxComponent,
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
