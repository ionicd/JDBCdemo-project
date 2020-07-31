package com.vastika.jdbcdemo.PreparedStatement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.jdbcdemo.Util.DBUtil;

	public class SelectDemo {

		public static final String SQL="select * from user_tbl where id=?";
	
		public static void main(String[] args) {
			
			try(PreparedStatement ps = DBUtil.getConnection().prepareStatement(SQL)){
				ps.setInt(1, 3);// to set where id = 3, and get only 3 details
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println("Id is: "+ rs.getInt("id"));
					System.out.println("Username is : "+ rs.getString("user_name"));
					System.out.println("Age is : "+ rs.getInt("age"));
					System.out.println("==============================================");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
