import { Component, Input, OnInit } from '@angular/core';
import { CommandeService } from 'src/app/pages/valider-panier-page/services/commande.service';
import { IPanier } from 'src/app/shared/models/panier';

@Component({
  selector: 'gf-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent implements OnInit {

  @Input() idCommande: number;
  panier: IPanier;

  constructor(private readonly commandeService: CommandeService) { }

  ngOnInit(): void {
    this.commandeService.getPanier(this.idCommande).subscribe(res => {
      this.panier = res;
    });
  }

}
