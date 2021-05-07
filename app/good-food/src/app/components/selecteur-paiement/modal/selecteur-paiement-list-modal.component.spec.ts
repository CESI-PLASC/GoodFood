import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { SelecteurPaiementListModalComponent } from './selecteur-paiement-list-modal.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { MockComponent } from 'ng-mocks';
import { InfoPaiementComponent } from '../../info-paiement/info-paiement.component';
import { SelecteurPaiementComponent } from '../selecteur-paiement.component';
import { MethodePaiementFormComponent } from '../../methode-paiement-form/methode-paiement-form.component';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

describe('SelecteurPaiementListModalComponent', () => {
    let spectator: Spectator<SelecteurPaiementListModalComponent>;
    const createComponent = createComponentFactory({
        component: SelecteurPaiementListModalComponent,
        imports: [
            FontAwesomeTestingModule,
        ],
        providers: [
            NgbActiveModal
        ],
        declarations: [
            MockComponent(InfoPaiementComponent),
            MockComponent(SelecteurPaiementComponent),
            MockComponent(MethodePaiementFormComponent),
        ]
    });


    let comp: SelecteurPaiementListModalComponent;


    beforeEach(() => {
        spectator = createComponent();
        comp = spectator.component;
    });

    it('Should create component', () => {
        expect(comp).toBeTruthy();
    });
});
