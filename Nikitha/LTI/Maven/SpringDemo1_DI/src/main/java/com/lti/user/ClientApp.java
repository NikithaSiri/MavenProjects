package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Address;
import com.lti.entity.Employee;

//2 ways of creating beans
//1. Using xml Configuration
//2.Using Java Config - annotation

public class ClientApp {
	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring-Config.xml");
		
		Employee e = (Employee) context.getBean("e1");
		System.out.println(e);
		e.displayAllNos();
		
		/*Employee e1= new Employee(101,"Nikki");
		Address a1= new Address("Hyderabad","Telanagana");
		e1.setAddress(a1);
		System.out.println(e1);*/
	}
}
