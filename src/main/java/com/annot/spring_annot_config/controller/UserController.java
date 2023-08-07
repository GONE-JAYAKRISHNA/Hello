package com.annot.spring_annot_config.controller;

import com.annot.spring_annot_config.service.UserService;
import com.annot.spring_annot_config.service.impl.UserServiceImpl;
import com.spring.myfirstspring_project1.UserDto;

public class UserController {

	public static void main(String[] args) {
		//first we are collecting the data through UserDto object
		UserDto userDto=new UserDto();
		userDto.setId(1);
		userDto.setName("shashank");
		userDto.setEmail("shashank3@gmail.com");
		userDto.setPassword("@king9");
		//at second,we are servicing the data from UserService
		UserService userService=new UserServiceImpl();
			userService.saveUser(userDto);
			
		}
	}

