package com.lti.gui;
import com.lti.entity.Student;
public class StudentApp {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setStuId(101);
		s1.setStuName("Nikitha");
       // s1.setStuFees(700);	
        System.out.println(s1);
	Student s2=new Student(102,"Usha",70000);
	System.out.println(s2);
	}
}
