package com.lti.sets;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

import com.lti.mapdemos.Product;
	public class DemoSets {
	public static void main(String[] args) {
		/*Map<String,String> mailIds=new HashMap<>();
				mailIds.put("user1@gmail.com","psw1");
	            mailIds.put("user2@gmail.com","psw2");
	            mailIds.put("user3@gmail.com","psw3");
		        System.out.println(mailIds);*/
		      
		
		        Product p1=new Product(101,"Mobile",60000);
		        Product p2=new Product(102,"Charger",30000);
		        Product p3=new Product(103,"Mobile",60000);
               // Set<Product> mySet = new HashSet<>();
		        //sorted order
                  Set<Product> mySet = new TreeSet<>();
		          //tree set is by default we get data in ordered format
		        mySet.add(p1);
		        mySet.add(p2);
		        mySet.add(p3);
		        
		        System.out.println(p1.hashCode());
		        System.out.println(p2.hashCode());
		        System.out.println(p3.hashCode());
		        
		        System.out.println(mySet); 
	}
	}

