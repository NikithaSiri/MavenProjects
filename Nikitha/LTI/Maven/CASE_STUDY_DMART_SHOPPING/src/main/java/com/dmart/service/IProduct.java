package com.dmart.service;

import java.util.List;

import com.dmart.entity.Product;

public interface IProduct {
	
		public String addProduct(Product p);
		public abstract List<Product> getAllProducts();
}
