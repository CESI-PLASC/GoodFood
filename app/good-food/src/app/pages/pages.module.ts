import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ComponentsModule } from '../components/components.module';
import { CataloguePageComponent } from './catalogue-page/catalogue-page.component';
import { PagesRoutingModule } from './pages-routing.module';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { HttpClientModule } from '@angular/common/http';
import { FranchisePageComponent } from './franchise-page/franchise-page.component';
import { ValiderPanierPageComponent } from './valider-panier-page/valider-panier-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CoordonneeClientPageComponent } from './coordonnee-client-page/coordonnee-client-page.component';


@NgModule({
  declarations: [
    CataloguePageComponent,
    FranchisePageComponent,
    ValiderPanierPageComponent,
    CoordonneeClientPageComponent,
  ],
    imports: [
        CommonModule,
        ComponentsModule,
        PagesRoutingModule,
        FontAwesomeModule,
        HttpClientModule,
        FormsModule,
        ReactiveFormsModule
    ]
})
export class PagesModule { }
