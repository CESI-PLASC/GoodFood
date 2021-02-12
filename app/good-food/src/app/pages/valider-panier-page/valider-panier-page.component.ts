import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ICommande } from 'src/app/shared/models/commande';
import { CommandeService } from './services/commande.service';

@Component({
  selector: 'gf-valider-panier-page',
  templateUrl: './valider-panier-page.component.html',
  styleUrls: ['./valider-panier-page.component.scss']
})
export class ValiderPanierPageComponent implements OnInit {

  public commande: ICommande;

  constructor(private route: ActivatedRoute, private readonly commandeService: CommandeService) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      console.log(params.idCommande);
      this.commandeService.getOne(params.idCommande).subscribe(commande => {
        this.commande = commande;
      });
    })
  }

}
