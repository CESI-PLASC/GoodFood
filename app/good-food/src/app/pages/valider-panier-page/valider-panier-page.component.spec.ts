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
import { InfoFranchiseComponent } from '../../components/info-franchise/info-franchise.component';
import { RouterTestingModule } from '@angular/router/testing';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Adresse form component tests', () => {
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
    ],
    declarations: [
      PanierComponent,
      InfoAdresseComponent,
      SelecteurAdresseComponent,
      InfoFranchiseComponent,
      PaiementCarteComponent,
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
