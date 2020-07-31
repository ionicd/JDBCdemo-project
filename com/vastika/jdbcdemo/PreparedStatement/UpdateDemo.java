package com.vastika.jdbcdemo.PreparedStatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbcdemo.Util.DBUtil;

public class UpdateDemo {

	public static final String SQL="update user_tbl set user_name=?, age =? where id =?";
	
	public static void main(String[] args) {
		try(PreparedStatement ps = DBUtil.getConnection().prepareStatement(SQL)){
			ps.setString(1, "Radha Giri");
			ps.setInt(2, 21);
			ps.setInt(3,3);
			ps.executeUpdate();
			System.out.println("Data updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
