package com.lti.user;

import javax.persistence.EntityManager;

import com.lti.dbutil.DBUtil;
import com.lti.entities.Department;
import com.lti.entities.Employee;

public class UserApp {

	public static void main(String[] args) {
		EntityManager em = DBUtil.getEntityManager();
		
		Department d1 = new Department("Sales");
		Department d2 = new Department("HR");
		em.getTransaction().begin();
		em.persist(d2);
		em.getTransaction().commit();
		
//		em.getTransaction().begin();
//		Department dept = em.find(Department.class, 15);
//		System.out.println(dept);
//		System.out.println("DEPARTMENT : "+dept.getDid());
//		em.getTransaction().commit();
		
//		em.getTransaction().begin();
//		
		Employee employee = new Employee();
		employee.setEname("Shubham");
		employee.setSalary(35000);
		employee.setJob_id(9);
//		
		//employee.setDepartment(dept);
//		
		em.persist(employee);
//		
//		int employeeId = employee.getEid();
		System.out.println("Record added : ");
//		
		em.getTransaction().commit();
		
		/*em.getTransaction().begin();
		
		Employee dbEmployee = em.find(Employee.class, 16);
		System.out.println("Employee " +dbEmployee);
		
		Department dbDept = em.find(Department.class, 14);
		System.out.println("Employee " +dbDept.getEmpList());
		
		em.getTransaction().commit();*/
//		
//		em.getTransaction().begin();
//		
//		Employee dbEmployee = em.find(Employee.class, employeeId);
//		System.out.println("\n Employee" +dbEmployee);
//		
//		em.getTransaction().commit();
//		
//		em.getTransaction().begin();
//
//		Department d1 = em.find(Department.class, 112);
//		System.out.println("\n Department" +d1);
//		
//		em.getTransaction().commit();
//		
//		Department dept1 = em.find(Department.class, 15);
//		System.out.println(dept1);
//		System.out.println("DEPARTMENT : "+dept1.getDname());

		
		em.close();
	}
}