import {Component, Input} from '@angular/core';
import {Suivi} from "../../suivi";

@Component({
  selector: 'app-detail-suivi',
  templateUrl: './detail-suivi.component.html',
  styleUrls: ['./detail-suivi.component.scss']
})
export class DetailSuiviComponent {
  @Input()
  suivi!: Suivi;
}
