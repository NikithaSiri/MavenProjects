package com.lti.user;

import com.lti.entity.Employee;

public class UserApp {
 public static void main(String[] args) {
	Employee e1=new Employee();
	e1.putData(101, "Jay", 4000.00f);
	System.out.println(e1);
	Employee e2=new Employee();
    e2.putData(102, "Vijay", 50000.00f);
    System.out.println(e2);
}
}
