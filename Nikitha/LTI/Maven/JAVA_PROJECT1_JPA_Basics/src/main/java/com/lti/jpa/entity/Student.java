package com.lti.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student {

	@Id
	@Column(name="STUDENT_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="HB_STU_SEQ")
	@SequenceGenerator(name="HB_STU_SEQ",sequenceName="Stu_Seq",allocationSize=0)
	private int studentId;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	@Column(name="STUDENT_SCORE")
	private double studentScore;

	public Student() {
		super();
	}

	/*public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}

	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}*/

	public Student(String studentName, double studentScore) {
		super();
		
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}

}