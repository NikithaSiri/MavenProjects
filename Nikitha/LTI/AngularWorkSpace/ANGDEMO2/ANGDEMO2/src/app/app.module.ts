import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { SaleComponent } from './sale/sale.component';

import { DemoSwitchComponent } from './demo-switch/demo-switch.component';
import { DemoStyleComponent } from './demo-style/demo-style.component';
import { DemoNgClassComponent } from './demo-ng-class/demo-ng-class.component';
import { NgifComponent } from './ngif/ngif.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    SaleComponent,
  
    DemoSwitchComponent,
    DemoStyleComponent,
  
    DemoNgClassComponent,
    NgifComponent
  ],
  imports: [
    BrowserModule,FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
