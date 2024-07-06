import {Component, Input} from '@angular/core';
import {Offre} from "../../offre";

@Component({
  selector: 'app-detail-offre',
  templateUrl: './detail-offre.component.html',
  styleUrls: ['./detail-offre.component.scss']
})
export class DetailOffreComponent {
  @Input()
  offre!: Offre;

  constructor(
  ) {
  }

  goToLink(): void {
    if (!this.offre.lien) {
      throw new Error("Lien non valide")
    }
    console.log("On va au lien");
    window.open(this.offre.lien);
  }
}
