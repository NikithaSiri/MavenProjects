import { Injectable } from '@angular/core';
import { Product } from '../product/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  public getProductList()
  {
    let prdList:Product[];
    prdList=[new Product(1, 'Mobile', 50000),
    new Product(2, 'Pendrive', 20000),
    new Product(3, 'Powerbank', 30000)];
  return prdList;
  }

  
  constructor() { }
}
