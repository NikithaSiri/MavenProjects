import { Component, OnInit } from '@angular/core';
import{MyCalcService} from '../my-calc.service'
@Component({
  selector: 'app-b',
  templateUrl: './b.component.html',
  styleUrls: ['./b.component.css']
})
export class BComponent implements OnInit {

  bTitle="I am  component B";
result:number=0;
  constructor(service: MyCalcService) { 
    this.result=service.multi(10,20);
  }

  ngOnInit(): void {
  }

}
