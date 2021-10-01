package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Address;
import com.lti.entity.Employee;

/*
//3 ways of Bean Configuration
//1. xml configuration- no,nyName,byType
//2.Java configuration using annotations
//3.
 Autowiring - feature spring container*/


public class ClientApp {
	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring-Config.xml");
		
		Employee emp1 = (Employee) context.getBean("e1");
		System.out.println(emp1.hashCode());
		
		Employee emp2 = (Employee) context.getBean("e1");
		System.out.println(emp2.hashCode());
		
		
		/*Employee e1= new Employee(101,"Nikki");
		Address a1= new Address("Hyderabad","Telanagana");
		e1.setAddress(a1);
		System.out.println(e1);*/
	}
}
