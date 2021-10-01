package com.lti.beans;

public class Employee {
	
	private int empNo;
	private String empName;
	private double Salary;
	
	public Employee() {
		super();
	}
	public Employee(int empNo, String empName, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		Salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
	
}
