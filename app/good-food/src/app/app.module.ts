import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ListeFranchiseComponent } from './components/liste-franchise/liste-franchise.component';
import { InfoFranchiseComponent } from './components/info-franchise/info-franchise.component';

@NgModule({
  declarations: [
    AppComponent,
    ListeFranchiseComponent,
    InfoFranchiseComponent
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
