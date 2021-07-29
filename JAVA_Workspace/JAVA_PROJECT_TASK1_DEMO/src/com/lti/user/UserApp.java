package com.lti.user;
import java.time.LocalDate;
import java.util.List;

import com.lti.services.Info;

import com.lti.entity.Student;
import com.lti.entity.Course;
import com.lti.entity.Enroll;
public class UserApp {

	public static void main(String[] args) {
		
		LocalDate d1=LocalDate.of(2000, 1, 7);
		Student s1=new Student(101,"Jay",d1);
		Student s2=new Student(102,"Vijay",LocalDate.of(1990, 5, 5));
		Student s3=new Student(103,"Sanjay",LocalDate.of(1880,1,1));
		
		Info info=new Info();
		info.register(s1);
		info.register(s2);
		info.register(s3);
		
		List<Student> stuList=info.listOFStudent();
		System.out.println(stuList);
		
		Course c1=new Course(1,"C",2,200.25);
		Course c2=new Course(2,"Java",3,250.35);
		Course c3=new Course(3,"Html",4,500.00);
		
		info.introduce(c1);
		info.introduce(c2);
		info.introduce(c3);
		
		List<Course> couList = info.listOFCourse();
		System.out.println(couList);
		
		info.enroll(s1, c1, LocalDate.of(1991, 1, 10));
		info.enroll(s2, c2, LocalDate.of(2000, 2, 11));
		info.enroll(s3, c3, LocalDate.of(1801, 3, 12));
		
		List<Enroll> eList=info.listOFEnrollment();
		System.out.println(eList);
	}
}
