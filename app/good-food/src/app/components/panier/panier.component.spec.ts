import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { PanierComponent } from './panier.component';
import { Commande } from '../../shared/models/commande/commande';
import { NgbAccordionModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterTestingModule } from '@angular/router/testing';

describe('Panier component tests', () => {
  let spectator: Spectator<PanierComponent>;
  let comp: PanierComponent;
  const createComponent = createComponentFactory({
    component: PanierComponent,
    imports: [
      NgbAccordionModule,
        RouterTestingModule
    ]
  });

  beforeEach(() => {
    spectator = createComponent({
      props: {
        commande: new Commande({id: 777})
      }
    });
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });

  it('Should formules is empty', () => {
    comp.commande = new Commande({formules: []});

    const panier = spectator.query('.gf-panier-contenu');
    expect(panier.textContent).toContain('Le panier est vide');
  });
});
