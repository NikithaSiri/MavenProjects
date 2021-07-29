package com.lti.entity;

public abstract class Person {
	int pId;
 String pName;

 public abstract void calc();
 
 public Person() {
	 super();
 }
 public Person(int pId, String pName) {
	super();
	this.pId = pId;
	this.pName = pName;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
@Override
public String toString() {
	return "Person [pId=" + pId + ", pName=" + pName + "]";
}


}
