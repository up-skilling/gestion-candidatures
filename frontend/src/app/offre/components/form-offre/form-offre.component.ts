import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {NgForm} from "@angular/forms";
import {Offre} from "../../offre";
import {OffreService} from "../../../services/offre.service";

@Component({
  selector: 'app-form-offre',
  templateUrl: './form-offre.component.html',
  styleUrls: ['./form-offre.component.scss']
})
export class FormOffreComponent implements OnInit {
  offre: Offre = {};
  erreurMessage?: string;

  constructor(
    private offreService: OffreService,
    private router: Router) {
  }

  ngOnInit(): void {
  }

  onSubmitForm(): void {
    this.offreService.add(this.offre).subscribe({
      next: () => this.router.navigate(['/offres']),
      error: error => this.erreurMessage = error
    });
  }

  initForm(form: NgForm): void {
    form.reset();
  }
}
