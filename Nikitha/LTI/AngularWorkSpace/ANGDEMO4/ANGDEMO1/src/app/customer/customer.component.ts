import { Component, OnInit } from '@angular/core';
import { Customer } from './Customer';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  
  custList:Customer[]=
  [
  {custNo:1,custName:"Jay",custAdd:"Powai",city:"Mumbai",country:"India"},
  {custNo:2,custName:"ViJay",custAdd:"Bandra",city:"Mumbai",country:"India"},
  {custNo:3,custName:"SanJay",custAdd:"Vasai",city:"Mumbai",country:"India"},
];
  constructor() { }

  ngOnInit(): void {
  }

}
