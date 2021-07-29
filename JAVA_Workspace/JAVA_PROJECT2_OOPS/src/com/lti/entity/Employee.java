package com.lti.entity;

public class Employee {

	private int empId;
	private String empName;
	private float empSal;
	
	public void putData(int empid, String empName, float empSal)
	{
		this.empId=empid;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
