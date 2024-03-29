import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ValiderPanierPageComponent } from './valider-panier-page.component';
import { PaiementCarteComponent } from '../../components/paiement-carte/paiement-carte.component';
import { SelecteurAdresseComponent } from '../../components/selecteur-adresse/selecteur-adresse.component';
import { FontAwesomeTestingModule } from '@fortawesome/angular-fontawesome/testing';
import { InfoAdresseComponent } from '../../components/info-adresse/info-adresse.component';
import { PanierComponent } from '../../components/panier/panier.component';
import { NgbAccordionModule } from '@ng-bootstrap/ng-bootstrap';
import { InfoFranchiseComponent } from '../../components/franchise/info-franchise/info-franchise.component';
import { RouterTestingModule } from '@angular/router/testing';
import { MockComponent } from 'ng-mocks';
import { SelecteurPaiementComponent } from '../../components/selecteur-paiement/selecteur-paiement.component';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('Adresse form component tests', () => {
  let spectator: Spectator<ValiderPanierPageComponent>;
  let comp: ValiderPanierPageComponent;
  const createComponent = createComponentFactory({
    component: ValiderPanierPageComponent,
    imports: [
      FontAwesomeTestingModule,
      RouterTestingModule,
      FormsModule,
      NgbAccordionModule,
      ReactiveFormsModule,
      HttpClientTestingModule,
    ],
    declarations: [
      MockComponent(PanierComponent),
      MockComponent(InfoAdresseComponent),
      MockComponent(SelecteurAdresseComponent),
      MockComponent(SelecteurPaiementComponent),
      MockComponent(InfoFranchiseComponent),
      MockComponent(PaiementCarteComponent),
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
