package com.lti.entity;

public class Course {
private int courseId;
private String courseName;
private int durYrs;
private double fees;
public Course() {
	super();
}
public Course(int courseId, String courseName, int durYrs, double fees) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.durYrs = durYrs;
	this.fees = fees;
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
public int getDurYrs() {
	return durYrs;
}
public void setDurYrs(int durYrs) {
	this.durYrs = durYrs;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "\n Course [courseId=" + courseId + ", courseName=" + courseName + ", durYrs=" + durYrs + ", fees=" + fees
			+ "]";
}



}
