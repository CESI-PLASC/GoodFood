import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {CommonModule} from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PagesModule } from './pages/pages.module';
import { NavbarModule } from './components/navbar/navbar.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
  ],
    imports: [
        CommonModule,
        BrowserModule,
        AppRoutingModule,
        NgbModule,
        BrowserAnimationsModule,

        PagesModule,
        NavbarModule,
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
