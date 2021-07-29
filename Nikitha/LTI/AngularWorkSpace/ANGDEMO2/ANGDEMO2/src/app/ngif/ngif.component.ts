import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngif',
  templateUrl: './ngif.component.html',
  styleUrls: ['./ngif.component.css']
})
export class NgifComponent implements OnInit {
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
