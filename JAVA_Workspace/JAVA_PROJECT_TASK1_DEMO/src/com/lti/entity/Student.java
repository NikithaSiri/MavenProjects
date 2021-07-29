package com.lti.entity;

import java.time.LocalDate;

public class Student {
	
	private int stuId;
	private String stuName;
	private LocalDate dob;
	
	public Student() {
		super();
	}

	public Student(int stuId, String stuName, LocalDate dob) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.dob = dob;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "\n Student [stuId=" + stuId + ", stuName=" + stuName + ", dob=" + dob + "]";
	}
	
	
	
}
