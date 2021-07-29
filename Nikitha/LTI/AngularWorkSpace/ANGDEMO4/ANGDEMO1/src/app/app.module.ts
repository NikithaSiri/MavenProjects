import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MycompoComponent } from './mycompo/mycompo.component';

import { CustomerComponent } from './customer/customer.component';
import { EmployeeComponent } from './employee/employee.component';
import { UserComponent } from './user/user.component';
//import { AddUserComponent } from './User/add-user/add-user.component';-->

@NgModule({
  declarations: [
    AppComponent,
    MycompoComponent,
   // SomeComponent,
    CustomerComponent,
    EmployeeComponent,
    UserComponent,
    //AddUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
