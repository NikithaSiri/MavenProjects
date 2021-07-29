/* Parent- child, base-derived, super-sub,
 * extends keyword,*/

package com.lti.entity;

public class Employee extends Person {
private double basicSal;

public void calc()
{
	double tSal=basicSal+5000;
	System.out.println("total sal" + tSal);
}
public Employee(double basicSal) {
	super();
	this.basicSal=basicSal;
}
public Employee() {
	super();
}

public double getBasicSal() {
	return basicSal;
}

public void setBasicSal(double basicSal) {
	this.basicSal = basicSal;
}

public Employee(int pId, String pName)
{
	super(pId,pName);
}
}
