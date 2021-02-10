import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MonPanierComponent } from './components/mon-panier/mon-panier.component';
import { ValiderPanierPageComponent } from './pages/valider-panier-page/valider-panier-page.component';

@NgModule({
  declarations: [
    AppComponent,
    MonPanierComponent,
    ValiderPanierPageComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
