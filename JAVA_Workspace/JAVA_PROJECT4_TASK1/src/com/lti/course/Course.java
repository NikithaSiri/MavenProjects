package com.lti.course;

//import com.lti.entity.Student;

public class Course {
	private int courseId;
	private String courseName;
	private double courseFees;
	
	public Course(int courseId, String courseName, double courseFees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "courseId=" + courseId + "\ncourseName=" + courseName + "\ncourseFees=" + courseFees;
	}
	
	
	}
	
	
	


