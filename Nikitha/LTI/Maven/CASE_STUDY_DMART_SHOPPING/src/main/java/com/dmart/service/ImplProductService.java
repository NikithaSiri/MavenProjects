package com.dmart.service;

import java.util.ArrayList;
import java.util.List;

import com.dmart.dao.IProductDao;
import com.dmart.dao.ImplProductDao;
import com.dmart.entity.Product;

public class ImplProductService implements IProduct {

		IProductDao  dao= new ImplProductDao();
		
	
	@Override
	public String addProduct(Product p) {
		String msg=dao.addProduct(p);
		return msg;
	}
public List<Product> getAllProducts() {
		
	
	       
        List<Product> prdList=dao.getAllProducts();
        return prdList;
  
	}

}
