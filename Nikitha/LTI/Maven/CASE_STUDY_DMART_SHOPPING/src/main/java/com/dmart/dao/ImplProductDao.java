package com.dmart.dao;

import java.util.ArrayList;
import java.util.List;

import com.dmart.entity.Product;

public class ImplProductDao implements IProductDao {

	static List<Product> prdList = new ArrayList<>();
	@Override
	public String addProduct(Product p) {
		// TODO Auto-generated method stub
		prdList.add(p);
		return "Product Added";
	}
	@Override
	public List<Product> getAllProducts() {
		
		return prdList;
}
}
