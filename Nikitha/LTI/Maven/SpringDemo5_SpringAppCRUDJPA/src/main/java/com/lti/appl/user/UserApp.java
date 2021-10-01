package com.lti.appl.user;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.beans.Employee;
import com.lti.appl.exp.HrException;
import com.lti.appl.services.EmpService;

public class UserApp {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
		
		
		EmpService service=ctx.getBean("empservice",EmpService.class);
//		Employee e = new Employee(110,"Nine",9000);
//		int d = service.saveEmployee(e);
//      System.out.println("Your record is saved with id");
		
		List<Employee> list=service.displayAll();
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int Id = sc.nextInt();
		System.out.println("Enter salary to update");
		double salary = sc.nextDouble();
		
		 Employee e1;
		try {
			e1 = service.updateEmployee(Id, salary);
			System.out.println(e1);
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 System.out.println("Enter the id to search:");
		 int id = sc.nextInt();
		 Employee e2 = service.searchEmployee(id);
		 System.out.println(e2);
		 
		 System.out.println("Enter emp id to delete");
		 int empid = sc.nextInt();
		 String str = service.deleteEmployee(empid);
		 System.out.println(str);
		
		
	}

}