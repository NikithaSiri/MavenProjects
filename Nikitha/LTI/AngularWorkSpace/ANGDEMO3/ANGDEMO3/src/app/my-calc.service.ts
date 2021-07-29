import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyCalcService {

  //add( 10,20)  //add( 10,20,30,40) 
  // rest parameters 
  public add(...params: number[]): number {
    let result = 0;
    for (let val of params) {
        result += val;
    }
    return result;
  } 
 //multi(10,20)  // multi(10,20,30)
  public multi(x:number, y :number): number {
    let result = 0;    
    result=x*y;
    return result;
  }

  constructor() { }
}
