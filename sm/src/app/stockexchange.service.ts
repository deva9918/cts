import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Stockexchange } from './stockexchange';

@Injectable({
  providedIn: 'root'
})
export class StockexchangeService {

  private baseUrl = 'http://localhost:8086/StockExchange/stockexchange/';
  constructor(private http:HttpClient) { }
  getAllStockExchange(): Observable<any> {
 
   return this.http.get(`${this.baseUrl}`+'getAllStockExchange');
 
  }
 
  savestockexchange(stockexchange: Stockexchange): Observable<Stockexchange> {
 
   return this.http.post<Stockexchange>(this.baseUrl+'savestockexchange/',stockexchange);
 
  }
  
  deleteStockExchange(seid: Number): Observable<Stockexchange> {
 
   return this.http.delete<Stockexchange>(this.baseUrl+'deleteStockExchange/'+seid);
 
  }
  findOneInAll4(seid: Number): Observable<Stockexchange> {
 
    return this.http.get<Stockexchange>(this.baseUrl+'findOneInAll4/'+seid);
  
   }
 
  updateStockExchange(seid: number): Observable<Stockexchange> {
 
   return this.http.put<Stockexchange>(this.baseUrl+'/updateStockExchange/{seid}', seid);
 
  }
 
}
