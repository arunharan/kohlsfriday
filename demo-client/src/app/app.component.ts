import { Component } from '@angular/core';
import { CustomerService } from './customer.service';
import { Customer } from './customer.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  customers: Customer[];

  constructor(
    private customerService: CustomerService
  ) {
    this.getCustomers();
  }

  private getCustomers(): void {
    this.customerService.getCustomers().then(customers => this.customers = customers);
  }

}
