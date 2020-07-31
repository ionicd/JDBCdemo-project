package com.vastika.jdbcdemo.Basic;

import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbcdemo.Util.DBUtil;

public class UpdateDemo {	

	public static final String SQL="update user_tbl set user_name='Saurav K', age =26 where id =1";

	public static void main(String[] args) {
		
			try ( Statement st = DBUtil.getConnection().createStatement(); ){
				st.executeUpdate(SQL);
				System.out.println("Data updated");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
