import { Component, Input, OnInit } from '@angular/core';
import { CommandeService } from 'src/app/pages/valider-panier-page/services/commande.service';
import { ICommande } from 'src/app/shared/models/commande';
import { Panier } from 'src/app/shared/models/panier';

@Component({
  selector: 'gf-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent implements OnInit {
  @Input() commande: ICommande;

  public panier?: Panier;
  public chargement: boolean;

  constructor(private readonly commandeService: CommandeService) {
    this.chargement = true;
  }

  ngOnInit(): void {
    this.commandeService.getPanier(this.commande.id).subscribe(panier => {
      this.chargement = false;
      this.panier = new Panier(panier);
    });
  }
}
