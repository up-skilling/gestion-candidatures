import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {SuiviRoutingModule} from './suivi-routing.module';
import {PageSuiviComponent} from "./page-suivi/page-suivi.component";
import {DetailSuiviComponent} from "./components/detail-suivi/detail-suivi.component";


@NgModule({
  declarations: [
    PageSuiviComponent,
    DetailSuiviComponent
  ],
  imports: [
    CommonModule,
    SuiviRoutingModule
  ]
})
export class SuiviModule { }
