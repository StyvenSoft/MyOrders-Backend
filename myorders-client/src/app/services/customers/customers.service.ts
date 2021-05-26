import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomersService {

  private API_SERVER = "http://localhost:8080/customers/";

  constructor(
    private httpClient : HttpClient
  ) { }

  public getAllCustomers(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }
}
