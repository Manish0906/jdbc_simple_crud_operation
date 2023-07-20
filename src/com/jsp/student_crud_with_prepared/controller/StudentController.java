package com.jsp.student_crud_with_prepared.controller;
import com.jsp.student_crud_with_prepared.dao.*;

import com.jsp.student_crud_with_prepared.service.*;
import com.jsp.student_crud_with_prepared.dto.*;
import java.util.*;

public class StudentController {
	public static void main(String[] args) {
		int i;
		
		do {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Main method started!!!");
		Student student=null;
		StudentService ss=new StudentService();
		
		System.out.println("Main method ended!!!!");
		System.out.println("1.insert\n2.Update\n3.Dislplay\n4.Delete");
		System.out.println("Enter your option:");
		 
		int ch=sc.nextInt(); 
		switch(ch) {
//		Insert the data
		case 1:{
			System.out.println("Enter student id:");
			int id=sc.nextInt();
			System.out.println("Enter student name:");
			String name=sc.next();
			System.out.println("Enter email:");
			String email=sc.next();
			System.out.println("Enter phone no:");
			long phone_no=sc.nextLong();
			
			student=new Student(id,name,email,phone_no);
			ss.insertStudentservice(student);
		   
		}
		break;
		/*
		 * Update Method Started
		 */
		case 2: {
			System.out.println("Select\n 1.Update Name \n 2.Update Email \n 3.update phoneno");
			int x=sc.nextInt();
			switch(x) {
			case 1:{
			/*
			 * Update Student name
			 */
			
			System.out.println("Enter student id:");
			int id=sc.nextInt();
			System.out.println("Enter student name:");
			String name=sc.next();
		int id_1=ss.updateStudentNameService(id,name);
		if(id_1==1){
			System.out.println("++++ Data updated ++++");
		}
		else {
			System.err.println("Id is not found");
		}
			
		}
			
			break;
			/*
			 * update student Email
			 */
			
		case 2: {
			
			System.out.println("Enter student id:");
			int id=sc.nextInt();
			System.out.println("Enter student email:");
			String email=sc.next();
   int id_2=ss.updateStudentEmailService(id, email);
		if(id_2==1) {
			System.out.println("++++ Email data updated ++++++");
		}
		else {
			System.err.println("id is not found");
		}
			
			
		}
		break;
		/*
		 * Update student phoneno
		 */
		case 3:{
			System.out.println("Enter student id:");
			int id=sc.nextInt();
			System.out.println("Enter student phoneno:");
			long phoneno=sc.nextLong();
		int id_3=ss.updateStudentphoneService(id, phoneno);
		if(id_3==1) {
		System.out.println("==== Phone number data updated ==========");
		}
		else {
			System.err.println("Id not found");
			}
		}
		break;
		}
		}
		break;
		/*
		 * Update Method Ended here
		 */
			
		/*
		 * Display Method Started
		 */
		case 3:{
			ss.displayStudentService();
			
			
			
		}
		break;
		/*
		 * Delete Student Details method Started
		 */
		case 4:{
			System.out.println("Enter id to delete");
			int id=sc.nextInt();
			int id_4=ss.deleteStudentDetailsService(id);
			if(id_4==1) {
				System.out.println("+++++ Data Deleted Successfully ++++++");
			}else {
				System.err.println("Id Not Found");
			}
		}
	}System.out.println("Choose 0 to continue or any other Number to Exit:");
		i=sc.nextInt();
	
		}
		while(i==0);
		System.out.println("Thankyou Visit Again!!!!!!!!!");
		
		}
}

	
		
	


