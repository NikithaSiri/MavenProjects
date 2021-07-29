import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mycompo',
  templateUrl: './mycompo.component.html',
  styleUrls: ['./mycompo.component.css']
})
export class MycompoComponent implements OnInit {

  mymsg:string="i created first component in angular";
  constructor() { }

  ngOnInit(): void {
  }

}
