package com.lti.appl.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Employee;
import com.lti.appl.dao.EmpDao;
import com.lti.appl.exp.HrException;

@Service("empservice")
public class EmpServicesImpl implements EmpService {
	
	@Autowired //by type 
	private EmpDao empDao;
	
    public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public int saveEmployee(Employee e) {
		System.out.println("Service Layer--");
		empDao.saveEmployee(e);
		return 0;
	}

	@Override
	@Transactional
	public List<Employee> displayAll() {
		return empDao.displayAll();
		
	}

	@Override
	public Employee updateEmployee(int Id, double salary) throws HrException {
		
		return empDao.updateEmployee(Id, salary);
	}

	@Override
	public Employee searchEmployee(int Id) {
		
		return empDao.searchEmployee(Id);
	}

	@Override
	public String deleteEmployee(int id) {
		
		return empDao.deleteEmployee(id);
	}
	
	

}