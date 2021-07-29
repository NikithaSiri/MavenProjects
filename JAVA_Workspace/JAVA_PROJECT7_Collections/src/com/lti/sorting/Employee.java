package com.lti.sorting;

import com.lti.mapdemos.Product;

public class Employee implements Comparable<Employee>{

	int empId;
	String empName;
	double empSal;
	
	@Override
	public int compareTo(Employee p) {
		if(p.getEmpId()==this.getEmpId())
		{
	
		return 0;
		}
		else if(p.getEmpId()<this.getEmpId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
			}
	
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public Employee() {
		super();
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
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee\n[empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
}
