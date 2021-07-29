package com.lti.entity;

public class Student {

	private int stuId;
	private String stuName;
	private double stuFees;
	private String collegeName="ABCD";  // here if we donot give collegename and then we assign the value in default constructor, and after that if we try to make an object with passing all the parameters(given that there is an parametrized constructor for that), then we will see the name what we provided
										// if we donot give the college name here and initiliase in the default constructor and then have an object which we pass only three parameters(given that there a parametrised constructor for that also), and we r thinking that now we will get default collegName bcoz of deault constr. but this will NOT happen, the value will be null
										// if we initliase here and do or do not initialise in the default constructor and pass the three values in the object, then and then only we will see that we have the college name present over there.
	
	public Student() {
		super();
		this.stuId=0000;
		this.stuName="XXXX";
		this.stuFees=0.00;
        this.collegeName="AAAA";        // if we initialise the collegeName here, then this will be considered on priority,
										// ABCD which was first initialised, that will not be considered
	}
	
	
	public Student(int stuId, String stuName, double stuFees) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuFees = stuFees;
		
	}
	public Student(int stuId, String stuName, double stuFees, String collegeName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuFees = stuFees;
		this.collegeName = collegeName;
	}


	/**
	 * @return the studentId
	 */
	public int getStuId() {
		return stuId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStuId(int studentId) {
		this.stuId = studentId;
	}
	/**
	 * @return the stuName
	 */
	public String getStuName() {
		return stuName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	/**
	 * @return the studentFees
	 */
	public double getStuFees() {
		return stuFees;
	}
	/**
	 * @param studentFees the studentFees to set
	 */
	public void setStuFees(double stuFees) {
		this.stuFees = stuFees;
	}
	/**
	 * @return the collegeName
	 */
	public String getCollegeName() {
		return collegeName;
	}
	/**
	 * @param collegeName the collegeName to set
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "student Id=" + stuId + "\nstudentName=" + stuName + "\nstudentFees=" + stuFees;
	}
}