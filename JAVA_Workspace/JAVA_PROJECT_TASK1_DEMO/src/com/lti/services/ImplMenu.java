package com.lti.services;
import java.util.List;

import com.lti.entity.Course;
import com.lti.entity.Student;
public interface ImplMenu {
	public abstract void register(Student s);
	public abstract List<Student>  listOFStudent();
	public abstract List<Course> listOFCourse();     
}
