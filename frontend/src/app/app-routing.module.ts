import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {PageSuiviComponent} from "./suivi/page-suivi/page-suivi.component";

const routes: Routes = [
  {path: 'suivis', component: PageSuiviComponent},
  {path: 'offres', loadChildren: () => import('./offre/offre.module').then(module => module.OffreModule)},
  {path: '', redirectTo: 'suivis', pathMatch: 'full'},
  {path: '**', redirectTo: ''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
