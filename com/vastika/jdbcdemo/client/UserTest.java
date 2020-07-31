package com.vastika.jdbcdemo.client;

import java.util.List;
import java.util.Scanner;

import com.vastika.jdbcdemo.dao.UserDao;
import com.vastika.jdbcdemo.dao.UserDaoImpl;
import com.vastika.jdbcdemo.model.User;

public class UserTest {

	public static void main(String[] args) {

		UserDao userDao = new UserDaoImpl();
		
		Scanner sc = new Scanner(System.in);		
		
		String decision = "";
		
		do {
			System.out.println("Which db operation do you want to perform?");
			
			String choice = sc.next();
			switch (choice) {
			
			case "create":
				System.out.println("enter username: ");
				String username = sc.next();
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				
				User user = new User();
				user.setUserName(username);
				user.setAge(age);
				
				userDao.saveUserInfo(user);
				break;
			
			case "read":
				List<User> userList = userDao.getAllUserInfo();
				userList.forEach(u ->{
					System.out.println("User id is : "+ u.getId());
					System.out.println("User name is : "+ u.getUserName());
					System.out.println("User age is : "+ u.getAge());
					System.out.println("--------------------------------");
				});
				
				break;
				
			case "update":
				System.out.println("enter new username: ");
				String updatedName = sc.next();
				System.out.println("Enter new age: ");
				int updatedAge = sc.nextInt();
				System.out.println("Enter the id which you want to update: ");
				int id = sc.nextInt();
				
				User uUser = new User();
				uUser.setUserName(updatedName);
				uUser.setAge(updatedAge);
				uUser.setId(id);
				
				userDao.updateUserInfo(uUser);
				break;
				
			case "delete":
				System.out.println("Enter id to delete: ");
				int toDeleteId = sc.nextInt();
				userDao.deleteUserInfo(toDeleteId);
				
				break;
				
			default:
				System.out.println("Wrong choice");
								
			}
			System.out.println("Do you want to perform next operation?");
			decision = sc.next();
			
		}while (decision.equalsIgnoreCase("yes"));
		
		System.out.println("thank you , visit next time");
		sc.close();
		
		
	}

}
