import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CataloguePageComponent } from './catalogue-page/catalogue-page.component';
import { ValiderPanierPageComponent } from './valider-panier-page/valider-panier-page.component';
import { FranchisePageComponent } from './franchise-page/franchise-page.component';
import { AccueilPageComponent } from './layouts/accueil-page/accueil-page.component';
import { CoordonneeClientPageComponent } from './coordonnee-client-page/coordonnee-client-page.component';

const routes: Routes = [
  {
    path: 'commande/:idCommande',
    children: [
      {
        path: 'coordonnee',
        component: CoordonneeClientPageComponent
      },
      {
        path: 'validation',
        component: ValiderPanierPageComponent,
      }
    ]
  },
  {
    path: 'franchise',
    children: [
       {
         path: '',
         component: FranchisePageComponent
       },
      {
        path: ':id/catalogue',
        component: CataloguePageComponent
      }
    ]
  },
  {
    path: 'accueil',
    component: AccueilPageComponent
  },
  {
    path: '**',
    redirectTo: 'accueil'
  }

];

@NgModule({
  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class PagesRoutingModule { }
