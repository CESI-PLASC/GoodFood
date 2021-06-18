import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CommandePageComponent } from './commande-page.component';
import { CatalogueModule } from 'src/app/components/catalogue/catalogue.module';
import { PanierModule } from 'src/app/components/panier/panier.module';

@NgModule({
  declarations: [CommandePageComponent],
  imports: [CommonModule, CatalogueModule, PanierModule],
  exports: [CommandePageComponent],
})
export class CommandePageModule {}
