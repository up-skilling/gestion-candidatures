import {Component, OnInit} from '@angular/core';
import {Suivi} from "../suivi";
import {SuiviService} from "../../services/suivi.service";

@Component({
  selector: 'app-page-suivi',
  templateUrl: './page-suivi.component.html',
  styleUrls: ['./page-suivi.component.scss']
})
export class PageSuiviComponent implements OnInit {
  suivis: Suivi[] = [];

  constructor(
    private suiviService: SuiviService
  ) {
  }

  ngOnInit(): void {
    this.suiviService.getAll().subscribe(
      suivis => this.suivis = suivis
    );
  }
}
