package com.vastika.jdbcdemo.Basic;

import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbcdemo.Util.DBUtil;

import java.sql.ResultSet;

public class SelectDemo {

	public static final String SQL="select * from user_tbl";
	public static void main(String[] args) {
		
		try(Statement st = DBUtil.getConnection().createStatement()){
		ResultSet rs =	st.executeQuery(SQL); // all data is returned to rs
		while(rs.next()) {
			System.out.println("id is:"+ rs.getInt("id"));
			System.out.println("Username is:"+ rs.getString("user_name"));
			System.out.println("Age is :"+ rs.getString("age"));
			System.out.println("========================================");
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
