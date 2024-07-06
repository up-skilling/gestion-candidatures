import {Injectable} from '@angular/core';
import {Offre} from "../offre/offre";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";


@Injectable({
  providedIn: 'root'
})
export class OffreService {
  API_URL: string = 'http://localhost:8080/api';

  constructor(
    private httpClient: HttpClient
  ) {
  }

  getAll(): Observable<Offre[]> {
    return this.httpClient.get<Offre[]>(`${this.API_URL}/offres`);
  }

  add(valeursForm: Offre): Observable<Offre> {
    return this.httpClient.post(`${this.API_URL}/offres`, valeursForm);
  }
}
