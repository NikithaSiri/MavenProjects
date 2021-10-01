package com.lti.dao;

import com.lti.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	@Override
	public int saveEmployee(Employee e) {
		System.out.println("\n Dao layer" +e);
		return 0;
	}

}
