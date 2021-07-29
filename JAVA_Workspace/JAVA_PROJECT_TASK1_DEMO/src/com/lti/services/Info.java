package com.lti.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.lti.entity.Course;
import com.lti.entity.Enroll;
import com.lti.entity.Student;

public class Info implements ImplMenu{

	private List<Student> stuList=new ArrayList<>();
	private List<Course> couList=new ArrayList<>();
	private List<Enroll> eList=new ArrayList<>();
	
	public void register(Student s)
	{
		stuList.add(s);
		System.out.println("Student added");
	}
	public List<Student> listOFStudent()
	{
		return stuList;
	}
	
	
	public void introduce(Course c)
	{
		couList.add(c);
	System.out.println("Course added");
	}
	@Override
	public List<Course> listOFCourse() {
		// TODO Auto-generated method stub
		return couList;
	}
	
	public void enroll(Student s, Course c, LocalDate d)
{
		Enroll er=new Enroll(s,c,d);
		eList.add(er);
}
	public List<Enroll> listOFEnrollment()
	{
		return eList;
	}
	}

