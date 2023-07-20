package com.jsp.student_crud_with_prepared.service;
import com.jsp.student_crud_with_prepared.dao.*;
import com.jsp.student_crud_with_prepared.dto.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.student_crud_with_prepared.controller.*;

public class StudentService {
	StudentDao sd=new StudentDao();
	/*
	 * insert method for student
	 * 
	 */
	
	public Student insertStudentservice(Student student) {
		System.out.println("insert service started!!!!!");
		if(student.getStudentId()<=9999) {
			Student student2=sd.insertStudent(student);
			System.out.println("insert service method ended!!!!!!");
			return student2;
			
		}
		else {
			System.err.println("Please pass  your id with 4 digits or less than it");
		}
		return null;
		/*
		 * update student Name  data Methods
		 */
	}
		public int updateStudentNameService(int studentId, String studentName) {
			return sd.updateStudent(studentId, studentName);
			
		}
		
		/*
		 * update Email of student
		 */
		
		public int updateStudentEmailService(int studentId, String studentEmail) {
			return sd.updateStudent(studentId, studentEmail);
			
		}
		/*
		 * update phone no of student
		 */
		
		public int updateStudentphoneService(int studentId, long studentphoneno) {
			return sd.updateStudentphoneno(studentId, studentphoneno);
			
		}
		/*
		 * Display details of student
		 */
		public void displayStudentService() {
			sd.displayStudentDetails();
		}
		/*
		 * Delete the details of student
		 */
		public int deleteStudentDetailsService(int studentid) {
			return sd.DeleteStudentDetails(studentid);
		}
		
	}


