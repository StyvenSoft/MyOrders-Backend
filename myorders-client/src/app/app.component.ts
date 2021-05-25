import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CustomersService } from './services/customers/customers.service';
import { EmployeesService } from './services/employees/employees.service';
import { OrdersService } from './services/orders/orders.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  orderForm: FormGroup;

  constructor(
    public fb: FormBuilder,
    public customersService: CustomersService,
    public employeesService: EmployeesService,
    public ordersService: OrdersService,
  ) {

  }
  ngOnInit(): void {
    this.orderForm = this.fb.group({
      orderDate: ['', Validators.required],
      quantity: ['', Validators.required],
      unitPrice: ['', Validators.required],
    })
  }

  save(): void {

  }
}
