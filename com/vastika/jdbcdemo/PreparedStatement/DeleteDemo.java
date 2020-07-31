package com.vastika.jdbcdemo.PreparedStatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbcdemo.Util.DBUtil;

public class DeleteDemo {
	
	public static final String SQL="delete from user_tbl where id =?";

	public static void main(String[] args) {

		try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(SQL)){
			ps.setInt(1, 1);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
