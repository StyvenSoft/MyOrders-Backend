import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  private API_SERVER = "http://localhost:8080/orders/";

  constructor(
    private httpClient : HttpClient
  ) { }

  public getAllOrders(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public saveOrders(order: any): Observable<any>{
    return this.httpClient.post(this.API_SERVER, order);
  }
}
