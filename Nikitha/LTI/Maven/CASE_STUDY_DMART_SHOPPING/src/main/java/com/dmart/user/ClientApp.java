package com.dmart.user;

import java.util.List;
import java.util.Scanner;

import com.dmart.entity.Product;
import com.dmart.service.IProduct;
import com.dmart.service.ImplProductService;

public class ClientApp {
	public static void main(String[] args) {
		IProduct service=null;
		 Scanner sc= new Scanner(System.in);	 
		 String ans;
		 int no;
		do {
			System.out.println("***** DMART  Services ****");
			System.out.println("1. Add Product ->Enter Product Info ");	
			System.out.println("2. View Product -Products  ");			
			System.out.println("Pls enter your choice: ");
			no=sc.nextInt();			
					switch(no)
					{
					case 1:
						service=new ImplProductService();
					System.out.println("Enter product id,name and cost");
					int pid=sc.nextInt();
					String pname=sc.next();
					double pcost=sc.nextDouble();
					
					Product p=new Product(pid,pname,pcost);
					System.out.println(p);			
					
					String msg=service.addProduct(p);		
					System.out.println(service);
					
					break;
					case 2: 
						List<Product> myList=service.getAllProducts();
						System.out.println(myList);
							break;							
					}	
					System.out.println("wish to continue? type y/n  ");
					ans = sc.next();
					}while(ans.equals("Y")||ans.equals("y"));							
					System.out.println("Thanks and visit again.");							
		}
	}

