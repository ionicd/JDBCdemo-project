package com.vastika.jdbcdemo.dao;

import java.util.List;

import com.vastika.jdbcdemo.model.User;

public interface UserDao {
	
	void saveUserInfo(User user);
	
	List<User> getAllUserInfo();
	
	void updateUserInfo(User user);
	
	void deleteUserInfo(int id);
	
	
	

}
