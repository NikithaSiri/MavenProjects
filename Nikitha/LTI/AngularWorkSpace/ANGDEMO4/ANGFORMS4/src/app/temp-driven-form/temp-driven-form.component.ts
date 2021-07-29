import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-temp-driven-form',
  templateUrl: './temp-driven-form.component.html',
  styleUrls: ['./temp-driven-form.component.css']
})
export class TempDrivenFormComponent implements OnInit {
  vname:string="";
  vpsw:string="";
  
  ngOnInit(): void {
  }
  onSubmit(myForm:any)
  {
    console.log('Form data :' ,myForm);
    this.vname=myForm.var_name;
    this.vpsw=myForm.var_psw;
  }
  constructor() { }
}
