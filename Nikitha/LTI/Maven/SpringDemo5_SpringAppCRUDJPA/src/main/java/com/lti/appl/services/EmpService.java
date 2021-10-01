package com.lti.appl.services;

import java.util.List;

import com.lti.appl.beans.Employee;
import com.lti.appl.exp.HrException;

public interface EmpService {
	
	public int saveEmployee(Employee e);
	
	 public List<Employee> displayAll();
	 
	 public Employee updateEmployee(int Id, double salary) throws HrException;
	 
	 public Employee searchEmployee(int Id);

	 public String deleteEmployee(int id);
}