package com.lti.appl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.lti.appl.beans.Employee;
import com.lti.appl.exp.HrException;

@Repository("empDao")
@EnableTransactionManagement
public class EmpDaoImpl implements EmpDao {
	
	@PersistenceContext
	private EntityManager em;
	
    @Override
    @Transactional
	public int saveEmployee(Employee e) {
		System.out.println("Dao Layer-->"+e);
		em.persist(e);
		System.out.println("Rec Added");
		return 0;
	}
    
    @Override
    @Transactional
    public List<Employee> displayAll()
    {
    	String sql = "SELECT e FROM Employee e";
	
	   Query q = em.createQuery(sql);
		
	    List<Employee> empList = q.getResultList();
		return empList;
    }
    
    @Override
    @Transactional
    public Employee updateEmployee(int Id, double salary) throws HrException{
		
		
		Employee e1=em.find(Employee.class,Id);
		if(e1==null || e1.getEmpSal()<=4000) {
			throw new HrException("Salary can't be updated");
		}else {
			e1.setEmpSal(salary);
			//em.merge(e1);
			System.out.println("Updated");
		}
		
		
		
		//Using jpql
		//
		
		
		return e1;
	}
    
    
    @Override
    @Transactional
    public Employee searchEmployee(int Id) {
		
		
		
		Employee e1=em.find(Employee.class,Id);
		
		
		return e1;
	}

	@Override
	@Transactional
	public String deleteEmployee(int id) {
		Employee e1 = em.find(Employee.class, id);
		em.remove(e1);
		return "Employee Record Deleted";
	}

	

	

}