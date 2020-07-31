package com.vastika.jdbcdemo.Basic;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDBDemo {
	
	public static final String URL = "jdbc:mysql://localhost:3306/" + 
	// Add this for timezone issue with Driver
	"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String USER_NAME = "root";
	public static final String PASS = "admin123";
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String SQL = "create database user_db";
	
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;

		try { // 4 steps 
			// Register the driver if needed
//			Class.forName(DRIVER);
			// Get the object of connection using Driver Manager
			con = DriverManager.getConnection(URL,USER_NAME,PASS);
			// Get the statement object using connection
			st = con.createStatement();
			// Execute the query using statement
			st.executeUpdate(SQL);
			System.out.println("Database created!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // Additional step
			try {
				// Close the connection
				con.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		}
	}

}
