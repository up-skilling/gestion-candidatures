import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {PageOffreComponent} from "./page-offre/page-offre.component";
import {ListeOffreComponent} from "./components/liste-offre/liste-offre.component";
import {FormOffreComponent} from "./components/form-offre/form-offre.component";

const routes: Routes = [
  {
    path: '', component: PageOffreComponent,
    children: [
      {path: '', component: ListeOffreComponent, outlet: 'offres'}
    ]
  },
  {
    path: 'form-offre', component: PageOffreComponent,
    children: [
      {path: '', component: FormOffreComponent, outlet: 'offres'}
    ]
  },
  {path: '**', redirectTo: ''}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OffreRoutingModule { }
