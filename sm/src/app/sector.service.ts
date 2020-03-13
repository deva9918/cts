import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SectorService {

  private baseUrl = 'http://localhost:8086/Sector/sectors';



 constructor(private http:HttpClient){}

 getAllSectorDetails(): Observable<any> {

  return this.http.get(`${this.baseUrl}`+'/getAllSectorDetails');

 }



 saveSectorDetails(sectorid: object): Observable<any> {

  return this.http.post(this.baseUrl+'/saveSector', sectorid);

 }



 deleteSectorDetails(sectorid: number): Observable<any> {

  return this.http.delete(this.baseUrl+'/deleteSectordetails/'+sectorid);

 }



 getSectorDetails(sectorid: number): Observable<any> {

  return this.http.get(this.baseUrl+'/findOneInAll3/'+sectorid);

 }



 updateSectorDetails(sectorid:number): Observable<any> {

  return this.http.put(this.baseUrl+'updatecompany/{sectorid}',sectorid);

 }
}
