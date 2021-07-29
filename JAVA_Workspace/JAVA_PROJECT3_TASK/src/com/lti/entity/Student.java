package com.lti.entity;

public class Student {
    private int stuId;
    private String stuName;
    private int stuFees;
    private String CollegeName="VJIT";
    public Student() {
    	super();
    }
	public Student(int stuId,String stuName,int stuFees)
	{
		super();
	this.stuId=stuId;
	this.stuName=stuName;
	this.stuFees=stuFees;
	}
	public int getStuId() {
		return stuId;
	
	}
	public void setStuId(int stuId) {
		this.stuId=stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName=stuName;
	}
	public int getstuFees() {
	return stuFees;
	}
	public void setstuFees(int stuFees) {
		this.stuFees=stuFees;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuFees=" + stuFees + ", CollegeName="
				+ CollegeName + "]";
	}
	
	
	
}
