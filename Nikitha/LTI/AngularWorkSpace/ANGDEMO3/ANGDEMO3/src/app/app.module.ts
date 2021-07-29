import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DemoStyleComponent } from './demo-style/demo-style.component';
import { AComponent } from './a/a.component';
import { BComponent } from './b/b.component';
import { ProductComponent } from './product/product.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { ProductByIdComponent } from './product-by-id/product-by-id.component';

@NgModule({
  declarations: [
    AppComponent,
    DemoStyleComponent,
    AComponent,
    BComponent,
    ProductComponent,
    ErrorComponent,
    HomeComponent,
    ProductByIdComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
