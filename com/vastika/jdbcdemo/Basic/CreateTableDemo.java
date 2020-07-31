package com.vastika.jdbcdemo.Basic;

import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbcdemo.Util.DBUtil;

public class CreateTableDemo {
	
	public static final String SQL = "create table user_tbl (id int not null auto_increment, "
			+ "user_name varchar(50), age int, primary key(id))";
	public static void main(String[] args) {
		// Remove Finally block which is redundant
		try( // Get the statement object using connection
				Statement st = DBUtil.getConnection().createStatement();		
				// Connection con = DBUtil.getConnection();
		){
				st.executeUpdate(SQL ); // Execute the query using statement
				System.out.println("Table created!");
		}
			catch(SQLException se) {
			se.printStackTrace();
		}
	}
}
