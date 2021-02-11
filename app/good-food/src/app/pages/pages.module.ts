import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ComponentsModule } from '../components/components.module';
import { CataloguePageComponent } from './catalogue-page/catalogue-page.component';
import { PagesRoutingModule } from './pages-routing.module';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FranchisePageComponent } from './franchise-page/franchise-page.component';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [CataloguePageComponent, FranchisePageComponent],
  imports: [
    CommonModule, ComponentsModule, PagesRoutingModule, FontAwesomeModule,HttpClientModule
  ]
})
export class PagesModule { }
