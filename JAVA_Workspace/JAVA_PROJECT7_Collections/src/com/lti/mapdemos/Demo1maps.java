package com.lti.mapdemos;
import java.util.HashMap;
import java.util.Map;
public class Demo1maps {
public static void main(String[] args) {
	/*Map<String,String> mailIds=new HashMap<>();
			mailIds.put("user1@gmail.com","psw1");
            mailIds.put("user2@gmail.com","psw2");
            mailIds.put("user3@gmail.com","psw3");
	        System.out.println(mailIds);*/
	      
	
	        Product p1=new Product(101,"Mobile",60000);
	        Product p2=new Product(102,"Charger",30000);
	        Product p3=new Product(103,"Mobile",60000);

	        Map<Integer,Product> prdMap=new HashMap();
	        
	        prdMap.put(10001,p1);
	        prdMap.put(10002,p2);
	        prdMap.put(10003,p3);

}
}
