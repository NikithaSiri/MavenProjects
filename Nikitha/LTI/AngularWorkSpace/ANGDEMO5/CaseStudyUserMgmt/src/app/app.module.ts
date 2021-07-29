import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
//import { RouterModule,Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import{ListEmployeesComponent} from '.employees/list-employees.component';
//import { EmployeesService } from './employees.service';
import { EmployeesComponent } from './employees/employees.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { EmployeesService } from './employees.service';
//import {CreateEmpComponent} from './employees/create-emp/create-emp.component';
//import{CreateEmployComponent} from './employees/create-employ/create-emp.component';
@NgModule({
  declarations: [
    AppComponent,
    //ListEmployeesComponent,
    //CreateEmpComponent,
    //CreateEmployComponent,
    EmployeesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [EmployeesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
