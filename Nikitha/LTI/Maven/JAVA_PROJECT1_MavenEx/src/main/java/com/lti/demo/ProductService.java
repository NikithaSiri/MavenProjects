package com.lti.demo;

import java.util.List;
import java.util.ArrayList;

public class ProductService {

	List<Product> prdList=new ArrayList<>();
		public String addProduct(Product product)
		{
			prdList.add(product);
			return "Product Added";
		}
}
