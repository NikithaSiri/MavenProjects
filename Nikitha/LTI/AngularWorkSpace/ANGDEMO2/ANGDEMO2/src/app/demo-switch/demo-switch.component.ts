import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo-switch',
  templateUrl: './demo-switch.component.html',
  styleUrls: ['./demo-switch.component.css']
})
export class DemoSwitchComponent implements OnInit {
  Cars:any[]=[
    { name :"BMW",      average:12,     color:"blue"},

    { name :"Ford",     average:10,     color:"yellow"},

    { name :"Suzuki",     average:18,    color:"silver"},

  ];

  constructor() { }

  ngOnInit(): void {
  }

}
