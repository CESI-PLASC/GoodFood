import { NgModule } from '@angular/core';
import { AccueilPageModule } from './layouts/accueil-page/accueil-page.module';
import { CataloguePageModule } from './catalogue-page/catalogue-page.module';
import { CoordonneeClientPageModule } from './coordonnee-client-page/coordonnee-client-page.module';
import { FranchisePageModule } from './franchise-page/franchise-page.module';
import { ValiderPanierPageModule } from './valider-panier-page/valider-panier-page.module';
import { AdministrationPageModule } from './administration-page/administration-page.module';
import { AdministrationProduitsPageModule } from './administration-produits-page/administration-produits-page.module';
import { AdministrationFormulesPageModule } from './administration-formules-page/administration-formules-page.module';
import { PagesRoutingModule } from './pages-routing.module';
import { CommandePageModule } from './commande-page/commande-page.module';

@NgModule({
  imports: [
    PagesRoutingModule,

    AccueilPageModule,
    CataloguePageModule,
    CoordonneeClientPageModule,
    FranchisePageModule,
    ValiderPanierPageModule,
    AdministrationPageModule,
    AdministrationProduitsPageModule,
    CommandePageModule,
    AdministrationFormulesPageModule,
  ],
  declarations: [],
})
export class PagesModule {}
