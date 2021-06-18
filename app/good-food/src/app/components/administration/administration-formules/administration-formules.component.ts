import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AdministrationService } from 'src/app/pages/administration-page/services/administration.service';
import { Formule } from 'src/app/shared/models/formule/formule';

@Component({
  selector: 'gf-administration-formules',
  templateUrl: './administration-formules.component.html',
  styleUrls: ['./administration-formules.component.scss']
})
export class AdministrationFormulesComponent implements OnInit{
  public formules: Formule[];

  constructor(private readonly administrationService: AdministrationService,
    private readonly route: ActivatedRoute,) { }

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.administrationService.getFormulesByIdFranchise(params.id).subscribe(result => {
        this.formules = result;
      });
    });
  }
}
