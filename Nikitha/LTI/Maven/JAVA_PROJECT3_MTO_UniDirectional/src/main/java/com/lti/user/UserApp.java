package com.lti.user;

import javax.persistence.EntityManager;

import com.lti.dbutil.DBUtil;
import com.lti.entities.Department;
import com.lti.entities.Employee;

public class UserApp {
	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		
		em.getTransaction().begin();
		Department dept = em.find(Department.class, 111);
		System.out.println(dept);
		System.out.println("DEPARTMENT : "+dept.getDid());
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		Employee employee = new Employee();
		employee.setEname("Vijay");
		employee.setJob_id(8);
		employee.setSalary(70000);
		
		employee.setDepartment(dept);
		em.persist(employee);
		
		int employeeId = employee.getEid();
		System.out.println("Record added: "+employeeId);
		em.getTransaction().commit();
		
		//unidirectional @ManyToOne association, it means we can only access the
		//relationship from the child side where the foreign key resides
		Employee dbEmployee = em.find(Employee.class, employeeId);
		System.out.println("Employee: "+dbEmployee);
		
		//can't access the relationship in reverse way
		//related emp records are not displayed
		Department d1 = em.find(Department.class, 112);
		System.out.println("Department: "+d1);
	}

}