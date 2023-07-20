package com.jsp.student_crud_with_prepared.dto;

/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
public class Student {
	
/***
 * 
 * @author Manish
 * 
 */
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long phoneno;
	/*
	 * No arguement constructor
	 * 
	 */
	public Student() {
		super();
	}
	/*
	 * Arguement Constructor
	 * 
	 */

	public Student(int studentId, String studentName, String studentEmail, long phoneno) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.phoneno = phoneno;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "";
	}
	
	
}
