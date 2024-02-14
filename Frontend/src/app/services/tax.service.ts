import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Tax } from '../models/tax-management.model';

@Injectable({
  providedIn: 'root'
})
export class TaxService {
  private apiUrl = 'http://127.0.0.1:8081/taxmanagement/api/taxes';

  constructor(private http: HttpClient) { }

  getAllTaxes(): any {
    // write your logic here
    return null;
  }

  getTaxById(id: number): any {
    // write your logic here
    return null;
  }

  createTax(tax: Tax): any {
    // write your logic here
    return null;
  }

  updateTax(id: number, tax: Tax): any {
    // write your logic here
    return null;
  }

  deleteTax(id: number): any {
    // write your logic here
    return null;
  }
}
