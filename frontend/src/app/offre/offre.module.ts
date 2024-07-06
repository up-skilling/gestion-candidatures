import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {OffreRoutingModule} from './offre-routing.module';
import {PageOffreComponent} from "./page-offre/page-offre.component";
import {FormOffreComponent} from "./components/form-offre/form-offre.component";
import {ListeOffreComponent} from "./components/liste-offre/liste-offre.component";
import {FormsModule} from "@angular/forms";
import {DetailOffreComponent} from './components/detail-offre/detail-offre.component';


@NgModule({
  declarations: [
    PageOffreComponent,
    FormOffreComponent,
    ListeOffreComponent,
    DetailOffreComponent
  ],
  imports: [
    CommonModule,
    OffreRoutingModule,
    FormsModule
  ]
})
export class OffreModule { }
