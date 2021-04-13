import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CataloguePageComponent } from './catalogue-page/catalogue-page.component';
import { ValiderPanierPageComponent } from './valider-panier-page/valider-panier-page.component';
import { FranchisePageComponent } from './franchise-page/franchise-page.component';
import { AccueilComponent } from '../components/accueil/accueil.component';

const routes: Routes = [
  {
    path: 'commande/:idCommande/validation',
    component: ValiderPanierPageComponent
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
    component: AccueilComponent
  },
  {
    path: '**',
    redirectTo: 'franchise'
  }

];

@NgModule({
  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})
export class PagesRoutingModule { }
