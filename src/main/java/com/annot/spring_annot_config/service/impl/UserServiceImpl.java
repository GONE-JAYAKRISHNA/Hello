package com.annot.spring_annot_config.service.impl;

import com.annot.spring_annot_config.dao.UserDao;
import com.annot.spring_annot_config.dao.impl.Autowired;
import com.annot.spring_annot_config.service.UserService;
import com.spring.myfirstspring_project1.UserDto;

public class UserServiceImpl implements UserService {
@Autowired
UserDao userDao;
	@Override
	public void saveUser(UserDto userDto) {
	System.out.println("-----------------");
	System.out.println("transferring the data to Dao layer");
	userDao.saveUser(userDto);
	}

	@Override
	public void utilize() {	
		System.out.println("calling method of Dao layer");
		userDao.utilize();
	}

}
