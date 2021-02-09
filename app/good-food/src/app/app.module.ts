import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MonPanierComponent } from './components/mon-panier/mon-panier.component';
import { UneFormuleComponent } from './components/une-formule/une-formule.component';

@NgModule({
  declarations: [
    AppComponent,
    MonPanierComponent,
    UneFormuleComponent
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
