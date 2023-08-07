package com.annot.spring_annot_config.dao.impl;

import com.annot.spring_annot_config.dao.UserDao;
import com.spring.myfirstspring_project1.UserDto;

public class UserDaoImpl implements UserDao{
	
	public void saveUser(UserDto userDto) {
	System.out.println("------------------");
	System.out.println("------------------");
	System.out.println("Hello"+userDto.getName());
	System.out.println("Your email:"+userDto.getEmail());
	System.out.println("Dao class saved the data successfully");
	}

	public void utilize() {	
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("welcome to UserDao class");
		System.out.println("we provide user Services");
		System.out.println("Thank you visit again");
	}
		
}
