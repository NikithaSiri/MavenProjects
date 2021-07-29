import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  fullName:string="Nikitha";
  today=new Date();
  
  title = 'HEllo GET914 Scholars!!!';
  mymsg:string="hello all";
  isDisabled:boolean=false;

  numberA: number=100;
  numberB:number=200;

  addTwoNumbers()

  {
    return this.numberA+this.numberB;
  }
  getTitle():string{
    return this.title;
  }

  count:number=0;
  buttonClicked():void{
    this.count=this.count+1;
    console.log("Button clicked");
  }
}
