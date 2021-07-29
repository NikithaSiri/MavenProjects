
package com.lti.service;
import com.lti.course.Course;
import com.lti.entity.*;
import com.lti.course.*;
public class Info {

	public void display(Student s) {
		System.out.println(s);
		
	}
	public void display(Student tempAry[])
	{
          for(Student s:tempAry)
		{
			System.out.println(s);
		}
	}
	public void displayCourse(Course courseAry[])
	{

		for(Course c:courseAry)
		{
			System.out.println(c);
		}
	}
		
	
}
		
