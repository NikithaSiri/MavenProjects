import { Component, OnInit } from '@angular/core';
import { MyCalcService } from '../my-calc.service';

@Component({
  selector: 'app-a',
  templateUrl: './a.component.html',
  styleUrls: ['./a.component.css']
})
export class AComponent implements OnInit {
  aTitle="I am a component A";
  result:number=0;
  constructor(service: MyCalcService) {
    this.result=service.add(10,20);
   }

  ngOnInit(): void {
  }

}
