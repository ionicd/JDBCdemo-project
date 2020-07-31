package com.vastika.jdbcdemo.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static final String URL = "jdbc:mysql://localhost:3306/user_db" + 
	// Add this for timezone issue with Driver
	"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String USER_NAME = "root";
	public static final String PASS = "admin123";
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER_NAME, PASS);
	}
}
