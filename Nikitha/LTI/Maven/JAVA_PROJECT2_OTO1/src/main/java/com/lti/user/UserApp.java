package com.lti.user;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.dbutil.DBUtil;
import com.lti.entity.Address;
import com.lti.entity.Employee;

public class UserApp {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emFactory.createEntityManager();
		em.getTransaction().begin();
		
		/*Address a1=new Address(13,"Hyderabad","Telangana","India");
		
		Employee e1=new Employee(1003,"Rahul",60000,a1);
		
		em.getTransaction().begin();
		
		em.persist(e1);*/
		
		em.getTransaction().commit();
		
		System.out.println("Employee added");
		
		String sql1="SELECT  a FROM Employee a";
		Query qry1=em.createQuery(sql1);
		
		List<Address> addList=qry1.getResultList();
		
		for(Address a:addList)
		{
			System.out.println(a);
		}
		em.close();
	}
}
