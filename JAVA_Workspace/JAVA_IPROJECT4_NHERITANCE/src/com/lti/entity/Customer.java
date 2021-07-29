package com.lti.entity;

public class Customer extends Person {

	double billAmt;
	
	public void calc()
	{
		System.out.println("cust -> calcBill");
	}

	public Customer(int pId, String pName) {
		super(pId, pName);
	}
	
	public Customer(int pId, String pName,double billAmt) {
		super(pId,pName);
		this.billAmt=billAmt;
	}
	public Customer()
	{
		super();
	}
	public double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "Customer [billAmt=" + billAmt + "]";
	}
	
	
}
