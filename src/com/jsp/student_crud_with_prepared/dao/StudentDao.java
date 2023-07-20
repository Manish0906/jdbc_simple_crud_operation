package com.jsp.student_crud_with_prepared.dao;
import java.sql.*;
import com.jsp.student_crud_with_prepared.connection.*;
import com.jsp.student_crud_with_prepared.dto.*;
public class StudentDao {
	Connection conn=StudentConnection.getStudentConnection();
	/*
	 * Inserted Method for student
	 * 
	 */
	
	public Student insertStudent(Student student) {
		String insertQuery="insert into student values(?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(insertQuery);
			ps.setInt(1, student.getStudentId());
			ps.setString(2, student.getStudentName());
			ps.setString(3, student.getStudentEmail());
			ps.setLong(4, student.getPhoneno());
			ps.executeUpdate();
			System.out.println("====Data Updated=======");
			return student;
		}
		catch( SQLException e) {
			e.printStackTrace();
		}
		return null;
		/*
		 * insert method ended here
		 */
		
		/*
		 * update method started here
		 */
	}
		public int updateStudent(int studentId, String studentName) {
			String updateStudentNameQuery="update student set studentName=? where studentid=?";
			try {
				PreparedStatement preparedStatement =conn.prepareStatement(updateStudentNameQuery);
				preparedStatement.setInt(2, studentId);
				preparedStatement.setString(1, studentName);
				return preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return 0;
		
	}
		public int updateStudentEmail(int studentId, String studentEmail) {
			String updateStudentEmailQuery="update student set studentEmail=? where studentid=?";
			try {
				PreparedStatement preparedStatement =conn.prepareStatement(updateStudentEmailQuery);
				preparedStatement.setInt(2, studentId);
				preparedStatement.setString(1, studentEmail);
				return preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return 0;
		}
		public int updateStudentphoneno(int studentId, long studentphoneno) {
			String updateStudentphoneQuery="update student set studentphoneno=? where studentid=?";
			try {
				PreparedStatement preparedStatement =conn.prepareStatement(updateStudentphoneQuery);
				preparedStatement.setInt(2, studentId);
				preparedStatement.setLong(1, studentphoneno);
				return preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return 0;
		}
		/*
		 * Display Method started
		 */
			public void displayStudentDetails() {
				String displaystudentquery="select * from student";
				try {
					PreparedStatement ps=conn.prepareStatement(displaystudentquery);
					ResultSet rs=ps.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4));
					}
						
					}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
				/*
				 * Delete Method started
				 */
				public  int  DeleteStudentDetails(int studentid) {
					String deletestudentquery="delete from student where studentid=?";
					try {
						PreparedStatement ps=conn.prepareStatement(deletestudentquery);
						ps.setInt(1, studentid);
						return ps.executeUpdate();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					return 0;
				}
				
				}
			
		
		
	



