package com.lti.user;
import com.lti.entity.Employee;

public class UserApp {
public static void main(String[] args) {
	Employee e1= new Employee(101,"Jay",500.00f,"lti");
	float tSal=e1.totalSal();

	System.out.println(tSal);
	
	Employee e2=new Employee();
	e2.setEmpId(102);
	e2.setEmpName("Ajay");
	e2.setEmpSal(60000);
	System.out.println(e2);
	e2.totalSal();
}
}
