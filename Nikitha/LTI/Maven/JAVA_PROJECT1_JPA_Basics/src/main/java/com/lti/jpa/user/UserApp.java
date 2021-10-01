package com.lti.jpa.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.jpa.entity.Student;

public class UserApp {

	public static void main(String[] args) {
		
		/*Student student= new Student(106,"StuNine",70000);
		System.out.println(student);*/
		
		Student s2=new Student("StuTw",85);
		//s2.setStudentName("StuEl");
		//s2.setStudentScore(100);
		System.out.println(s2);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(s2);
		em.getTransaction().commit();
		
		System.out.println("Record Added");
		
		/*Student s= em.find(Student.class, 103);
		System.out.println(s);
		
		s.setStudentScore(98);
		
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();*/
		
		
		em.close();
	}
}
