import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AComponent} from './a/a.component';
import {BComponent} from './b/b.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { ProductByIdComponent } from './product-by-id/product-by-id.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [
{path:"A",component:AComponent},
{path:"B",component:BComponent},
//{path:"product",component:ProductComponent},
//{path: "product/byid/:id", component:ProductByIdComponent},

{path:'product',component:ProductComponent,
children:[{path:'byid/:id',component:ProductByIdComponent}],
},
//<router-outlet></router-outlet> in parent i.e., ProductComponent
{path:"",component:HomeComponent},
{path:"**",component:ErrorComponent},//end of all router path variables
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
