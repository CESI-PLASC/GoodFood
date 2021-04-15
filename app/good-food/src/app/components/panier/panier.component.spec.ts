import { Spectator } from '@ngneat/spectator';
import { createComponentFactory } from '@ngneat/spectator/jest';
import { PanierComponent } from './panier.component';
import { Commande } from '../../shared/models/commande/commande';
import { NgbAccordionModule } from '@ng-bootstrap/ng-bootstrap';

/* TODO (node:26449) UnhandledPromiseRejectionWarning: TypeError: Converting circular structure to JSON */

xdescribe('Panier component tests', () => {
  let spectator: Spectator<PanierComponent>;
  let comp: PanierComponent;
  const createComponent = createComponentFactory({
    component: PanierComponent,
    imports: [
      NgbAccordionModule
    ]
  });

  beforeEach(() => {
    spectator = createComponent();
    comp = spectator.component;
  });

  it('Should create component', () => {
    expect(comp).toBeDefined();
  });

  it('Should formules is empty', () => {
    comp.commande = new Commande({formules: []});

    const panier = spectator.query<HTMLDivElement>('gf-panier-contenu > div');
    expect(panier.textContent).toContain('Le panier est vide');
  });
});
