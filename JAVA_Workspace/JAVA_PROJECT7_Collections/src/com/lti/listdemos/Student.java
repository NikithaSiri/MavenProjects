package com.lti.listdemos;

public class Student {

	private int stuId;
	private String stuName;
	private double fees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String stuName, double fees) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.fees = fees;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student\n[stuId=" + stuId + ", stuName=" + stuName + ", fees=" + fees + "]";
	}
	
	
}
