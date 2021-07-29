import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ifelse',
  templateUrl: './ifelse.component.html',
  styleUrls: ['./ifelse.component.css']
})
export class IfelseComponent implements OnInit {
  showAction:boolean=true;
  contacts:any=[
    {name:"jay",email:"jay@gmail.com"},
    {name:"Vijay",email:"vijay@gmail.com"},
    {name:"Sanjay",email:"sanjay@gmail.com"},
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
