package com.vastika.jdbcdemo.Basic;

import java.sql.SQLException;
import java.sql.Statement;

import com.vastika.jdbcdemo.Util.DBUtil;

public class DeleteDemo {

	public static final String SQL="delete from user_tbl where id =1";

	public static void main(String[] args) {
		
			try ( Statement st = DBUtil.getConnection().createStatement(); ){
				st.executeUpdate(SQL);
				System.out.println("Data deleted");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}
