package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.User;
import com.test.repository.UserRepository;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	//inject repository
	
	@Autowired
	private UserRepository userRepository;
	
	

	@Override
	public List<User> getClaimDetails() {
		List<User> userList=userRepository.findAll();
		return userList;
	}

	@Override
	public User getUpdateDetails(User user) {
		User userList=userRepository.save(user);
		return userList;
	}

}
