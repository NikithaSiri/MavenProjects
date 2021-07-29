import { Component, OnInit } from '@angular/core';
import { EmployeesService } from '../employees.service';
import { Employee } from './employee';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {

  empList:Employee[]=[];
  
  constructor(private employeeService: EmployeesService) { }

  ngOnInit() {
    this.getEmployees();
  }

  public getEmployees() 
  {
    this.employeeService.getEmployees().subscribe((data:Employee[]) =>
     {
      this.empList = data;
    }
    );
  }

}
