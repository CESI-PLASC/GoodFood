import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { CatalogueComponent } from './catalogue.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { NgbCollapseModule } from '@ng-bootstrap/ng-bootstrap';
import { CatalogueFiltreComponent } from './catalogue-filtre/catalogue-filtre.component';
import { SelectBoxComponent } from '../select-box/select-box.component';
import { ProduitListComponent } from '../produit/produit-list/produit-list.component';
import { ProduitItemComponent } from '../produit/produit-item/produit-item.component';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { Franchise } from '../../shared/models/franchise/franchise';
import { ActivatedRoute } from '@angular/router';

describe('Catalogue component tests', () => {
    let spectator: Spectator<CatalogueComponent>;
    let comp: CatalogueComponent;
    const createComponent = createComponentFactory({
        component: CatalogueComponent,
        imports: [
            FontAwesomeTestingModule,
            NgbCollapseModule,
            HttpClientTestingModule
        ],
        entryComponents: [
            CatalogueFiltreComponent,
            SelectBoxComponent,
            ProduitListComponent,
            ProduitItemComponent
        ],
        providers: [{
            provide: ActivatedRoute,
            useValue: {
                snapshot: {data: {isAdministration: false}}
            }
        }],
    });

    beforeEach(() => {
        spectator = createComponent({
            props: {
                franchise: new Franchise({id: 777})
            }
        });
        comp = spectator.component;
    });

    it('Should create component', () => {
        expect(comp).toBeDefined();
    });
});
