package com.lti.entity;

public class Employee {
	
	/*A constructor in Java is similar to a method 
	 * that is invoked when an object of the class is created. 
	 * Unlike Java methods, a constructor has the same name as that of the class 
	 * and does not have any return type.
	 */
	
	//declaring the instance variables.instance variables have to be declared private.
	private int empId;
	private String empName;
	private float empSal;
	private String companyName = "LTI";
	
	
	
	public float totalSal()
	{
		float hra = 10000.00f;
		float ta = 2000.00f;
		float tax = empSal*0.10f;
		
		float tsal = empSal+hra+ta - tax;
		
		System.out.println("total salary :="+tsal);
		return tsal;
	}
	
	//generate->source-->untick all variables.
	//default constructor.
	public Employee() {
		
		//super();
	}

	//parameterized constructor
	//1. Using 'this' keyword to refer current class instance variables · 
	//2. Using this() to invoke current class constructor · 
	
	public Employee(int empId, String empName, float empSal, String companyName) {
		super();
		//to call the constructor.
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.companyName = companyName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", companyName="
				+ companyName + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}