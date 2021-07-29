import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo-ngif',
  templateUrl: './demo-ngif.component.html',
  styleUrls: ['./demo-ngif.component.css']
})
export class DemoNgifComponent implements OnInit {
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
