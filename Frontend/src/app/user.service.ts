import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = 'http://localhost:8080/temp';  // Adjust as per your backend

  constructor(private http: HttpClient) { }

  signup(userData: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/signup`, userData);
  }

  login(userData: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/login`, userData);
  }

  adminSignup(adminData: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/admin-signup`, adminData);
  }

  adminLogin(adminData: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/admin-login`, adminData);
  }
}
