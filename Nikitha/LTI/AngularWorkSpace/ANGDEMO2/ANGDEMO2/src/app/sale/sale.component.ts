import { Component, OnInit } from '@angular/core';
import { Sale } from './Sale';

@Component({
  selector: 'app-sale',
  templateUrl: './sale.component.html',
  styleUrls: ['./sale.component.css']
})
export class SaleComponent implements OnInit {
  saleList:Sale[]=
  [
  {prdId:101,prdQty:1,BillAmount:50000},
  {prdId:102,prdQty:2,BillAmount:12000},
  {prdId:103,prdQty:3,BillAmount:9000},
];
  constructor() { }

  ngOnInit(): void {
  }

}
