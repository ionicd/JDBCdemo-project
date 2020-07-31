package com.vastika.jdbcdemo.PreparedStatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbcdemo.Util.DBUtil;

public class InsertDemo {
	
	public static final String SQL="insert into user_tbl(user_name, age)values(?, ?)";

	public static void main(String[] args) {
		
		try(PreparedStatement ps = DBUtil.getConnection().prepareStatement(SQL)){
			ps.setString(1, "Krishna Giri");
			ps.setInt(2, 25);
			
			ps.executeUpdate();
			System.out.println("Data Inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
