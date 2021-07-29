import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeesComponent } from './employees/employees.component';
import { HttpClient } from '@angular/common/http';
const routes: Routes = [
  {path: 'employees',component:EmployeesComponent },
 // {path:' ',redirectTo:'/employees',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
