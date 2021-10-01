package com.lti.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.beans.Employee;
import com.lti.services.EmployeeService;
import com.lti.services.EmployeeServiceImpl;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Config.xml");
		
		Employee e1 = (Employee) context.getBean("e1", Employee.class);
		System.out.println(e1);
		
		EmployeeService service = context.getBean("service", EmployeeServiceImpl.class);
		service.saveEmployee(e1);
		
	}
	
}