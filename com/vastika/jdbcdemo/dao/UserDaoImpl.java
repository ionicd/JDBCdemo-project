package com.vastika.jdbcdemo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vastika.jdbcdemo.model.User;
import com.vastika.jdbcdemo.Util.DBUtil;
import com.vastika.jdbcdemo.Util.QueryUtil;

public class UserDaoImpl implements UserDao {
	
	

	@Override
	public void saveUserInfo(User user) {
		try(PreparedStatement ps = DBUtil.getConnection().prepareStatement(QueryUtil.INSERT_SQL)){
			ps.setString(1, user.getUserName());
			ps.setInt(2, user.getAge());
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<User> getAllUserInfo() {

		List<User> userList = new ArrayList<User>();
		
		try(PreparedStatement ps = DBUtil.getConnection().prepareStatement(QueryUtil.LIST_SQL)){
		
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("user_name"));
				user.setAge(rs.getInt("age"));
				
				userList.add(user);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public void updateUserInfo(User user) {
		try(PreparedStatement ps = DBUtil.getConnection().prepareStatement(QueryUtil.UPDATE_SQL)){
			ps.setString(1, user.getUserName());
			ps.setInt(2, user.getAge());
			ps.setInt(3,user.getId());
			ps.executeUpdate();
			System.out.println("Data updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public void deleteUserInfo(int id) {
		try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(QueryUtil.DELETE_SQL)){
			ps.setInt(1,id);
			ps.executeUpdate();
			System.out.println("data deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
