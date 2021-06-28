import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AdministrationService } from 'src/app/pages/administration-page/services/administration.service';
import { AdministrationFormulesService } from 'src/app/pages/administration-formules-page/services/administration-formules.service';
import { Formule, IFormule } from 'src/app/shared/models/formule/formule';

@Component({
  selector: 'gf-administration-formules',
  templateUrl: './administration-formules.component.html',
  styleUrls: ['./administration-formules.component.scss']
})
export class AdministrationFormulesComponent implements OnInit{
  public formules: Formule[];

  constructor(
    private readonly adminFormulesService: AdministrationFormulesService,
    private readonly administrationService: AdministrationService,
    private readonly route: ActivatedRoute,
    public router: Router) { }

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.administrationService.getFormulesByIdFranchise(params.id).subscribe(result => {
        this.formules = result;
      });
    });
  }

  public changerStatut(idformule: number): void {
    if (confirm('Voulez-vous changer le statut de cette formule ?')) {
      this.adminFormulesService.deleteFormule(idformule);
      let currentUrl = this.router.url;
      this.router.navigateByUrl('/', {skipLocationChange: true}).then(() => {
          this.router.navigate([currentUrl]);
          console.log(currentUrl);
      });
    }
  }
}
