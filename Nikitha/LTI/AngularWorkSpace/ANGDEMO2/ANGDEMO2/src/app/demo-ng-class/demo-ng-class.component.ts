import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo-ng-class',
  templateUrl: './demo-ng-class.component.html',
  styleUrls: ['./demo-ng-class.component.css']
})
export class DemoNgClassComponent implements OnInit {

  Cars: any[] = [
    {
      name: "Ford",
      color: "blue"
    },
    {
      name: "BMW",
      color: "red"
    },
    {
      name: "Suzuki",
      color: "purple"
    },

  ];

  constructor() { }

  ngOnInit(): void {
  }

}
