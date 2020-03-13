import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
 providedIn: 'root'

})

export class UserService {
 
 private baseUrl = 'http://localhost:8086/User/UserPortal';
 constructor(private http:HttpClient) { }
 getAllUser(): Observable<any> {

  return this.http.get(`${this.baseUrl}`+'/getAllUser');

 }

 saveUser(user: object): Observable<object> {

  return this.http.post(`${this.baseUrl}`+'/saveUser',user);

 }
 find(username: string): Observable<User> {

  return this.http.get<User>(this.baseUrl+'/findOneInAll6/'+username);

 }
 deleteUser(username: string): Observable<object> {

  return this.http.delete<User>(`${this.baseUrl}/deleteUser/`+username);

 }

 updateUser(username: String): Observable<any> {

  return this.http.put(this.baseUrl+'/deleteUser/{username}',username);

 }

  findByUsernameAndPassword(username:String,password: String):Observable<User>{

    return this.http.get<User>(this.baseUrl+'/findByUsernameAndPassword/'+username+'/'+password);
  
   }
   uploadFile( file: File , id : number ) : Observable<any>  
   {  
     let url = this.baseUrl + "uploadImage/" + id ;  
   
     const formdata: FormData = new FormData();  
     
     formdata.append('file', file);  
    
     return this.http.post(url , formdata);  
   }

}

