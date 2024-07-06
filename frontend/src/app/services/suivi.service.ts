import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Suivi} from "../suivi/suivi";

@Injectable({
  providedIn: 'root'
})
export class SuiviService {
  API_URL: string = 'http://localhost:8080/api';

  constructor(
    private httpClient: HttpClient
  ) {
  }

  getAll(): Observable<Suivi[]> {
    return this.httpClient.get<Suivi[]>(`${this.API_URL}/suivis`);
  }

  add(valeursForm: Suivi): Observable<any> {
    return this.httpClient.post(`${this.API_URL}/suivis`, valeursForm);
  }
}
