import { Injectable, Inject } from '@angular/core';
import { Headers, Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';

import { Customer } from './customer.model';

@Injectable()
export class CustomerService {

  private headers = new Headers({ 'Content-Type': 'application/json' });

  constructor(private http: Http) {
    this.headers = new Headers({ 'Content-Type': 'application/json' });
  }

  private static handleError(error: any): Promise<any> {
    return Promise.reject(error.message || error);
  }

  getCustomers(): Promise<Customer[]> {
    return this.http.get('/api/demo/customers')
      .toPromise()
      .then(response => response.json() as Customer[])
      .catch(CustomerService.handleError);
  }


}
