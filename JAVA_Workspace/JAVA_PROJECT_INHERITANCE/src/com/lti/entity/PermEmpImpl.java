package com.lti.entity;

public class PermEmpImpl implements IPerson{
	
	private int empId;
	private double basicSal;
	
	@Override
	public void calc() {
		double tSal=basicSal+100000;
		System.out.println("prem emp -> sal"+tSal);		
	}
	
	public PermEmpImpl() {
		super();
	}

	public PermEmpImpl(int empId, double basicSal) {
		super();
		this.empId = empId;
		this.basicSal = basicSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	
	@Override
	public String toString() {
		return "PermEmpImpl [empId=" + empId + ", basicSal=" + basicSal + "]";
	}



	

}
