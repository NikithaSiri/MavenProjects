package com.lti.services;

import com.lti.beans.Employee;
import com.lti.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao empDao;
	
	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public int saveEmployee(Employee e)
	{
		System.out.println("\n Service layer---->" +e);
		
		empDao.saveEmployee(e);
		return 0;
	}
	
	
	
}