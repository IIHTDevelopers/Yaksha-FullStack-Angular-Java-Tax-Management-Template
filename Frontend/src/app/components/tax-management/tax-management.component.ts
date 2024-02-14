import { Component, OnInit } from '@angular/core';
import { TaxService } from '../../services/tax.service';
import { Tax } from '../../models/tax-management.model';

@Component({
  selector: 'app-tax-management',
  templateUrl: './tax-management.component.html',
  styleUrls: ['./tax-management.component.css']
})
export class TaxManagementComponent implements OnInit {
  taxes: Tax[] = [];
  selectedTax: Tax = {
    taxFormId: 0,
    formType: '',
    filingDate: new Date(),
    totalTaxAmount: 0,
    userId: 0
  };

  constructor(private taxService: TaxService) { }

  ngOnInit(): void {
    // write your logic here
  }

  loadTaxes(): void {
    // write your logic here
  }

  addTax(): void {
    // write your logic here
  }

  showUpdateForm(id: number): void {
    // write your logic here
  }

  updateTaxApi(): void {
    // write your logic here
  }

  deleteTax(id: number): void {
    // write your logic here
  }

  selectTax(tax: Tax): void {
    // write your logic here
  }

  createEmptyTax(): any {
    // write your logic here
    return null;
  }
}
