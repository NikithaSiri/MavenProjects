package com.lti.user;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lti.entity.Employee;

public class UserApp {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		//1
		/*String sql = "SELECT e FROM Employee e";

		Query qry = em.createQuery(sql);

		List<Employee> empList = qry.getResultList();
		for(Employee e:empList)
		{
		System.out.println(e);
		}*/
		
		//2
		/*String sql = "SELECT e FROM Employee e";
		TypedQuery<Employee> tq=em.createQuery(sql,Employee.class);
		List<Employee> myList=tq.getResultList();
		System.out.println(myList);*/
		
		//3 where clause
	/*	String sql = "SELECT e FROM Employee e where e.eid=103";
		TypedQuery<Employee> tq=em.createQuery(sql,Employee.class);
		List<Employee> myList=tq.getResultList();
		System.out.println(myList);*/
		
		//4 
		/*String sql = "SELECT e FROM Employee e WHERE e.ename='Jerry'";
		TypedQuery<Employee> typedQuery = em.createQuery(sql, Employee.class);
		List<Employee> empList = typedQuery.getResultList();
		System.out.println(empList);*/
		//5
		/*String sql1 = "SELECT e FROM Employee e where e.ename= :p_name ";
		
		TypedQuery<Employee> tq=em.createQuery(sql1,Employee.class);
		
		tq.setParameter("p_name", "Jay"); //use scanner class to take input from user
		List<Employee> myList=tq.getResultList();
		System.out.println(myList);*/
		
		//6- Ordinal Parameters (?->index)
		
		/*String sql = "SELECT e FROM Employee e WHERE e.ename=?1";
		TypedQuery<Employee> typedQuery = em.createQuery(sql, Employee.class);
		typedQuery.setParameter(1, "Jay"); // use scanner
		List<Employee> empList = typedQuery.getResultList();
		System.out.println(empList);*/
		
		//7 - Aggregate Functions
		/*String sql = "SELECT SUM(e.salary) FROM Employee e";
		TypedQuery<Double> typedQuery = em.createQuery(sql, Double.class);
		Double res = typedQuery.getSingleResult();
		System.out.println(res);*/
		
		//8 - Named Query:statiscally define / Predefined syntax - not going to change -we need it frequently
		/*Query qry= em.createNamedQuery("find employee by id",Employee.class);
		qry.setParameter("id",106);
		List<Employee> myList=qry.getResultList();
		System.out.println(myList);*/
		//9 -Pagination
		/*TypedQuery<Employee> tq=em.createQuery("Select e FROM Employee e",Employee.class);
		tq.setFirstResult(3);
		tq.setMaxResults(5);
		List<Employee> empList= tq.getResultList();
		System.out.println(empList);*/
		
		Query qry= em.createQuery("Select e.ename, a.city FROM Employee e INNER JOIN e.address a");
		List<Object[]> list=qry.getResultList();
		for(Object[] ary:list) {
			System.out.println(Arrays.toString(ary));
		}
		
		
		 
		 
		
		
		
		em.getTransaction().commit();
		em.close();
		}

}

