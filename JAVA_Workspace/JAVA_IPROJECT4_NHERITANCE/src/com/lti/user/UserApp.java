package com.lti.user;
import com.lti.entity.Customer;
import com.lti.entity.Employee;
import com.lti.entity.Person;
public class UserApp {
public static void main(String[] args) {
	
	//Person p=new Person(1000,"A");
	//System.out.println(p);
	//p.calc();
	
	System.out.println("*******");
	
	Employee e1=new Employee(101,"Jay");
	System.out.println(e1);
    e1.calc();
    
	System.out.println("*******");
	
	Customer c= new Customer(103,"Vijay",6000);
    System.out.println(c);
    c.calc();
}
}
