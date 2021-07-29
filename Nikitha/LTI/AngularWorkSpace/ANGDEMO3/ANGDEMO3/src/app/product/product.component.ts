import { Component, OnInit } from '@angular/core';
import { ProductService } from '../Services/product.service';
import { Product } from './product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
prdList:Product[]=[];

  constructor(prdService:ProductService) 
{
  this.prdList=prdService.getProductList();
  console.log(this.prdList);
}
  ngOnInit(): void {
  }

}
