import { Component, Input, OnInit } from '@angular/core';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { Adresse } from 'src/app/shared/models/adresse';
import Localisation from 'src/app/shared/models/Localisation';

@Component({
  selector: 'gf-selecteur-adresse',
  templateUrl: './selecteur-adresse.component.html',
  styleUrls: ['./selecteur-adresse.component.scss']
})
export class SelecteurAdresseComponent implements OnInit {

  @Input() localisations?: Localisation[];
  public adresse?: Adresse = undefined;
  private modal?: NgbModalRef | null;

  constructor(private modalService: NgbModal) { }

  ngOnInit(): void {
  }

  open(content){
    this.modal = this.modalService.open(content, {centered: true, size: "lg"});
  }

  selectAdresse(adresse: Adresse){
    this.adresse = adresse;
    this.modal.close();
    this.modal = null;
  }
}
