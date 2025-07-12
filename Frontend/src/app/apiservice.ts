import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ApiHomeService {

  constructor( private httpClient:HttpClient) {}
   
  signup(body: any):Observable<any>{
    return this.httpClient.post("http://localhost:8080/auth/signup", body);
  }

}
