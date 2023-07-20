package com.jsp.student_crud_with_prepared.connection;
import java.sql.*;

public class StudentConnection {

	public static Connection getStudentConnection() {
		
		try {
//			step-1:Load and rigister the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			step-2 Create Connection
			String url="jdbc:mysql://localhost:3306/Crud";
			String user="root";
			String pass="Manish@123";
			
		Connection conn=DriverManager.getConnection(url,user,pass);
		return conn;
			
		}
		catch(ClassNotFoundException |SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
