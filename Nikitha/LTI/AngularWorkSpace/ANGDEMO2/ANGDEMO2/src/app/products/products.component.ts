import { Component, OnInit } from '@angular/core';
import { Product } from './Product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  prodList:Product[]=
  [
  {prodId:101,prodName:"Mobile",prodCost:50000},
  {prodId:102,prodName:"Charger",prodCost:6000},
  {prodId:103,prodName:"Keyboard",prodCost:3000},
];
  constructor() { }

  ngOnInit(): void {
  }

}
