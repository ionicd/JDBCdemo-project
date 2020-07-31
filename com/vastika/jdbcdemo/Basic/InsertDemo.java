package com.vastika.jdbcdemo.Basic;

import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbcdemo.Util.DBUtil;

public class InsertDemo {
	
	public static final String SQL = "insert into user_tbl (id, user_name, age)"
			+ "values(1, 'Java', 10);";
	public static void main(String[] args) {
		try( Statement st = DBUtil.getConnection().createStatement();	){
				st.executeUpdate(SQL ); // Execute the query using statement
				System.out.println("Data inserted!");
		} catch(SQLException se) {
			se.printStackTrace();
		}
	}
}