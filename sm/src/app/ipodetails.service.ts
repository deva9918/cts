import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ipodetails } from './ipodetails';


@Injectable({
  providedIn: 'root'
})
export class IpodetailsService {

  private baseUrl = 'http://localhost:8086/IpoDetails/ipodetails/';
  constructor(private http: HttpClient) { }
  getAllIpoDetails(): Observable<any> {

    return this.http.get(`${this.baseUrl}` + 'getAllIpoDetails');

  }

  saveIpoDetails(ipodetails: Ipodetails): Observable<Ipodetails> {

    return this.http.post<Ipodetails>(this.baseUrl + 'saveIpodetails', ipodetails);

  }
  getIpoDetails(ipoid: number): Observable<Ipodetails> {

    return this.http.get<Ipodetails>(this.baseUrl + 'findOneInAll2/' + ipoid);

  }
  deleteIpoDetails(ipoid: number): Observable<Ipodetails> {

    return this.http.delete<Ipodetails>(this.baseUrl + 'deleteipodetails/' +ipoid);

  }

  updateIpoDetails(ipoid: number): Observable<Object> {

    return this.http.put<Ipodetails>(this.baseUrl + 'updateipodetails/{iopid}', ipoid);

  }













}
