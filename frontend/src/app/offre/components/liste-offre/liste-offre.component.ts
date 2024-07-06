import {Component, OnInit} from '@angular/core';
import {Offre} from "../../offre";
import {OffreService} from "../../../services/offre.service";

@Component({
  selector: 'app-liste-offre',
  templateUrl: './liste-offre.component.html',
  styleUrls: ['./liste-offre.component.scss']
})
export class ListeOffreComponent implements OnInit {
  offres: Offre[] = [];

  constructor(
    private offreService: OffreService
  ) {
  }

  ngOnInit(): void {
    this.offreService.getAll().subscribe(
      offres => this.offres = offres
    );
  }
}
