package com.lti.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.entity.Contract_Employee;

public class UserApp1 {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emFactory.createEntityManager();
		em.getTransaction().begin();	
	
	Contract_Employee cemp = new Contract_Employee("Priyanka",20000.00,1000.00f,"20");

	em.persist(cemp);
	System.out.println("cemp added");

	em.getTransaction().commit();

	
	em.close();
}
}
